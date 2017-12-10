/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.draytonwiser.handler;

import static org.openhab.binding.draytonwiser.DraytonWiserBindingConstants.*;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.smarthome.core.library.types.DecimalType;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.ThingStatusDetail;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.eclipse.smarthome.core.types.UnDefType;
import org.openhab.binding.draytonwiser.internal.config.HeatHub;
import org.openhab.binding.draytonwiser.internal.config.RoomStat;
//Additional Imports
import org.openhab.binding.draytonwiser.internal.connection.DraytonWiserConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link DraytonWiserHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author Rob Pope - Initial contribution
 */
// @NonNullByDefault
public class DraytonWiserHandler extends BaseThingHandler {

    private static final String DEVICE_IP_PARAM = "deviceIP";
    private static final String AUTH_TOKEN_PARAM = "authToken";
    private final Logger logger = LoggerFactory.getLogger(DraytonWiserHandler.class);

    private final DraytonWiserConnection connection = new DraytonWiserConnection();

    private String DraytonWiserAddress;
    private String DraytonWiserToken;
    private HeatHub DraytonWiserHeatHub;
    ScheduledFuture<?> refreshJob;

    public DraytonWiserHandler(Thing thing) {
        super(thing);
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        if (channelUID.getId().equals(CHANNEL_TEMPERATURE)) {
            // TODO: handle command

            // Note: if communication with thing fails for some reason,
            // indicate that by setting the status with detail information
            // updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.COMMUNICATION_ERROR,
            // "Could not control device at IP address x.x.x.x");
        }
        if (channelUID.getId().equals(CHANNEL_SETPOINT)) {
            int newSetPoint = Integer.parseInt(command.toString()) * 10;
            String roomName = channelUID.getThingUID().getId();
            connection.setRoomTemperature(DraytonWiserAddress, DraytonWiserToken, roomName, newSetPoint);
        }
    }

    @Override
    public void initialize() {
        logger.debug("Initialising Drayton Wiser Handler");

        org.eclipse.smarthome.config.core.Configuration config = getThing().getConfiguration();
        DraytonWiserAddress = (String) config.get(DEVICE_IP_PARAM);
        DraytonWiserToken = (String) config.get(AUTH_TOKEN_PARAM);

        // Connect to the heat hub
        // DraytonWiserData = connection.getResponseFromQuery("abc123");
        DraytonWiserHeatHub = connection.getResponseFromQuery(DraytonWiserAddress, DraytonWiserToken);

        updateStatus(ThingStatus.ONLINE);

        startAutomaticRefresh();

    }

    @Override
    public void dispose() {
        refreshJob.cancel(true);
    }

    public void startAutomaticRefresh() {
        // refreshJob.cancel(true);
        refreshJob = scheduler.scheduleWithFixedDelay(() -> {
            try {
                boolean success = updateDraytonWiserData();
                if (success) {
                    updateState(new ChannelUID(getThing().getUID(), CHANNEL_TEMPERATURE), getTemperature());
                    updateState(new ChannelUID(getThing().getUID(), CHANNEL_HUMIDITY), getHumidity());
                    updateState(new ChannelUID(getThing().getUID(), CHANNEL_SETPOINT), getSetPoint());
                }
            } catch (Exception e) {
                logger.debug("Exception occurred during execution: {}", e.getMessage(), e);
                updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.OFFLINE.COMMUNICATION_ERROR, e.getMessage());
            }
        }, 0, 60, TimeUnit.SECONDS);
    }

    private synchronized boolean updateDraytonWiserData() {
        DraytonWiserHeatHub = connection.getResponseFromQuery(DraytonWiserAddress, DraytonWiserToken);
        return true;
    }

    private State getTemperature() {
        float temp = 0;
        if (DraytonWiserHeatHub != null) {
            for (RoomStat roomstat : DraytonWiserHeatHub.getRoomStat()) {
                temp = roomstat.getMeasuredTemperature();
                temp = temp / 10;
            }
            if (temp != 0) {
                return new DecimalType(temp);
            }
        }
        return UnDefType.UNDEF;
        // return new DecimalType("1");
    }

    private State getHumidity() {
        int hum = 0;
        if (DraytonWiserHeatHub != null) {
            for (RoomStat roomstat : DraytonWiserHeatHub.getRoomStat()) {
                hum = roomstat.getMeasuredHumidity();
            }

            if (hum != 0) {
                return new DecimalType(hum);
            }
        }
        return UnDefType.UNDEF;
        // return new DecimalType("1");
    }

    private State getSetPoint() {
        float setpoint = 0;
        if (DraytonWiserHeatHub != null) {
            for (RoomStat roomstat : DraytonWiserHeatHub.getRoomStat()) {
                setpoint = roomstat.getSetPoint();
                setpoint = setpoint / 10;
            }
            if (setpoint != 0) {
                return new DecimalType(setpoint);
            }
        }
        return UnDefType.UNDEF;
        // return new DecimalType("1");
    }
}
