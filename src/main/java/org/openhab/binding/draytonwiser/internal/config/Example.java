
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("System")
    @Expose
    public System system;
    @SerializedName("Cloud")
    @Expose
    public Cloud cloud;
    @SerializedName("HeatingChannel")
    @Expose
    public List<HeatingChannel> heatingChannel = null;
    @SerializedName("Room")
    @Expose
    public List<Room> room = null;
    @SerializedName("Schedule")
    @Expose
    public List<Schedule> schedule = null;
    @SerializedName("Device")
    @Expose
    public List<Device> device = null;
    @SerializedName("UpgradeInfo")
    @Expose
    public List<UpgradeInfo> upgradeInfo = null;
    @SerializedName("SmartValve")
    @Expose
    public List<SmartValve> smartValve = null;
    @SerializedName("RoomStat")
    @Expose
    public List<RoomStat> roomStat = null;

}
