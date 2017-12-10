/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.draytonwiser.internal.connection;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openhab.binding.draytonwiser.internal.config.HeatHub;
import org.openhab.binding.draytonwiser.internal.config.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

/**
 * Implementation for Drayton Wiser url connection, based on the Yahoo Weather binding by Christoph Weitkamp.
 *
 * @author Rob Pope - Created first version
 *
 */
public class DraytonWiserConnection {

    private final Logger logger = LoggerFactory.getLogger(DraytonWiserConnection.class);

    // private static final String WEBSERVICE_URL = "http://192.168.3.6/data/domain/";

    private static final String METHOD = "GET";

    private static final int TIMEOUT = 10 * 1000; // 10s

    public HeatHub getResponseFromQuery(String WEBSERVICE_URL, String AUTHTOKEN) {
        try {

            URL url = new URL("http://" + WEBSERVICE_URL + "/data/domain/");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(TIMEOUT);
            con.setRequestMethod(METHOD);
            con.setRequestProperty("SECRET", AUTHTOKEN);

            InputStream response = con.getInputStream();

            try (Scanner scanner = new Scanner(response)) {
                String responseBody = scanner.useDelimiter("\\A").next();

                HeatHub hh = new Gson().fromJson(responseBody, HeatHub.class);

                return hh;
            }
            /*
             * return HttpUtil.executeUrl(METHOD,
             * WEBSERVICE_URL + "&q=" + URLEncoder.encode(query, StandardCharsets.UTF_8.toString()), TIMEOUT);
             */

        } catch (IOException e) {
            logger.warn("Communication error occurred while getting your Drayton Wiser information: {}",
                    e.getMessage());
        }
        return null;
    }

    public void setRoomTemperature(String WEBSERVICE_URL, String AUTHTOKEN, String roomName, int newTemp) {
        try {

            // Find room ID based on name
            String roomId = getRoomID(WEBSERVICE_URL, AUTHTOKEN, roomName);

            CloseableHttpClient http = HttpClientBuilder.create().build();

            String payload = "{\"RequestOverride\":{\"Type\":\"Manual\",\"SetPoint\":" + Integer.toString(newTemp)
                    + " }}";
            HttpPatch updateRequest = new HttpPatch("http://192.168.3.6/data/domain/Room/" + roomId);
            updateRequest.setEntity(new StringEntity(payload, ContentType.APPLICATION_JSON));
            updateRequest.setHeader("SECRET", AUTHTOKEN);

            HttpResponse response = http.execute(updateRequest);
            String out = response.getEntity().toString();
            logger.debug(out);

        } catch (IOException e) {
            logger.warn("Communication error occurred while getting your Drayton Wiser information: {}",
                    e.getMessage());
        }
    }

    public String getRoomID(String WEBSERVICE_URL, String AUTHTOKEN, String roomName) {
        // Convert config room name to lowercase with no spaces
        roomName = roomName.toLowerCase().replaceAll("\\s+", "");

        try {

            URL url = new URL("http://" + WEBSERVICE_URL + "/data/domain/");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(TIMEOUT);
            con.setRequestMethod(METHOD);
            con.setRequestProperty("SECRET", AUTHTOKEN);

            InputStream response = con.getInputStream();

            try (Scanner scanner = new Scanner(response)) {
                String responseBody = scanner.useDelimiter("\\A").next();
                HeatHub hh = new Gson().fromJson(responseBody, HeatHub.class);
                for (Room myRoom : hh.getRoom()) {
                    String myRoomName = myRoom.getName().toLowerCase().replaceAll("\\s+", "");
                    if (myRoomName.equals(roomName)) {
                        return myRoom.getId().toString();
                    }
                }
            }
        } catch (IOException e) {
            logger.warn("Communication error occurred while getting your Drayton Wiser information: {}",
                    e.getMessage());
        }
        return null;
    }
}