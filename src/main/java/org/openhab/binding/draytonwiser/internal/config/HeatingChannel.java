
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeatingChannel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("RoomIds")
    @Expose
    private List<Integer> roomIds = null;
    @SerializedName("PercentageDemand")
    @Expose
    private Integer percentageDemand;
    @SerializedName("DemandOnOffOutput")
    @Expose
    private String demandOnOffOutput;
    @SerializedName("HeatingRelayState")
    @Expose
    private String heatingRelayState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getRoomIds() {
        return roomIds;
    }

    public void setRoomIds(List<Integer> roomIds) {
        this.roomIds = roomIds;
    }

    public Integer getPercentageDemand() {
        return percentageDemand;
    }

    public void setPercentageDemand(Integer percentageDemand) {
        this.percentageDemand = percentageDemand;
    }

    public String getDemandOnOffOutput() {
        return demandOnOffOutput;
    }

    public void setDemandOnOffOutput(String demandOnOffOutput) {
        this.demandOnOffOutput = demandOnOffOutput;
    }

    public String getHeatingRelayState() {
        return heatingRelayState;
    }

    public void setHeatingRelayState(String heatingRelayState) {
        this.heatingRelayState = heatingRelayState;
    }

}
