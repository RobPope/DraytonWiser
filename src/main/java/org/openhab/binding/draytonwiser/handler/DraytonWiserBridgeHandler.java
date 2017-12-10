package org.openhab.binding.draytonwiser.handler;

import org.eclipse.smarthome.core.thing.Bridge;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.binding.BaseBridgeHandler;

public abstract class DraytonWiserBridgeHandler extends BaseBridgeHandler {

    public DraytonWiserBridgeHandler(Bridge bridge) {
        super(bridge);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void thingUpdated(Thing thing) {
        super.thingUpdated(thing);
    }
}
