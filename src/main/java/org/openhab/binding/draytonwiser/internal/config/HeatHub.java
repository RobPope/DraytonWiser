
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeatHub {

    @SerializedName("System")
    @Expose
    private System system;
    @SerializedName("HeatingChannel")
    @Expose
    private List<HeatingChannel> heatingChannel = null;
    @SerializedName("Room")
    @Expose
    private List<Room> room = null;
    @SerializedName("Schedule")
    @Expose
    private List<Schedule> schedule = null;
    @SerializedName("Device")
    @Expose
    private List<Device> device = null;
    @SerializedName("UpgradeInfo")
    @Expose
    private List<UpgradeInfo> upgradeInfo = null;
    @SerializedName("RoomStat")
    @Expose
    private List<RoomStat> roomStat = null;
    @SerializedName("Cloud")
    @Expose
    private Cloud cloud;

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public List<HeatingChannel> getHeatingChannel() {
        return heatingChannel;
    }

    public void setHeatingChannel(List<HeatingChannel> heatingChannel) {
        this.heatingChannel = heatingChannel;
    }

    public List<Room> getRoom() {
        return room;
    }

    public void setRoom(List<Room> room) {
        this.room = room;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    public List<Device> getDevice() {
        return device;
    }

    public void setDevice(List<Device> device) {
        this.device = device;
    }

    public List<UpgradeInfo> getUpgradeInfo() {
        return upgradeInfo;
    }

    public void setUpgradeInfo(List<UpgradeInfo> upgradeInfo) {
        this.upgradeInfo = upgradeInfo;
    }

    public List<RoomStat> getRoomStat() {
        return roomStat;
    }

    public void setRoomStat(List<RoomStat> roomStat) {
        this.roomStat = roomStat;
    }

    public Cloud getCloud() {
        return cloud;
    }

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }

}
