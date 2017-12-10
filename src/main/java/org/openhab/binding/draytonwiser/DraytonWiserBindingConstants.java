/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.draytonwiser;

import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.thing.ThingTypeUID;

import com.google.common.collect.Sets;

/**
 * The {@link DraytonWiserBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Rob Pope - Initial contribution
 */
@NonNullByDefault
public class DraytonWiserBindingConstants {

    private static final String BINDING_ID = "draytonwiser";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_HEATHUB = new ThingTypeUID(BINDING_ID, "heathub");
    public static final ThingTypeUID THING_TYPE_ROOM = new ThingTypeUID(BINDING_ID, "room");
    public static final ThingTypeUID THING_TYPE_ROOMSTAT = new ThingTypeUID(BINDING_ID, "roomstat");
    // Not needed?
    // public static final ThingTypeUID THING_TYPE_THERMOSTAT = new ThingTypeUID(BINDING_ID, "thermostat");
    // public static final ThingTypeUID BRIDGE_THING_TYPE = new ThingTypeUID(BINDING_ID, "heathub");

    // List of all Channel ids
    public static final String CHANNEL_TEMPERATURE = "currentTemperature";
    public static final String CHANNEL_HUMIDITY = "currentHumidity";
    public static final String CHANNEL_SETPOINT = "currentSetPoint";
    public static final String CHANNEL_BATTERYLEVEL = "batteryLevel";

    public static final Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Sets.newHashSet(THING_TYPE_ROOM,
            THING_TYPE_ROOMSTAT);

}
