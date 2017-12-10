
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Room {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("OverrideType")
    @Expose
    private String overrideType;
    @SerializedName("RoomStatId")
    @Expose
    private Integer roomStatId;
    @SerializedName("ScheduleId")
    @Expose
    private Integer scheduleId;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Mode")
    @Expose
    private String mode;
    @SerializedName("DemandType")
    @Expose
    private String demandType;
    @SerializedName("CalculatedTemperature")
    @Expose
    private Integer calculatedTemperature;
    @SerializedName("CurrentSetPoint")
    @Expose
    private Integer currentSetPoint;
    @SerializedName("PercentageDemand")
    @Expose
    private Integer percentageDemand;
    @SerializedName("ControlOutputState")
    @Expose
    private String controlOutputState;
    @SerializedName("DisplayedSetPoint")
    @Expose
    private Integer displayedSetPoint;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOverrideType() {
        return overrideType;
    }

    public void setOverrideType(String overrideType) {
        this.overrideType = overrideType;
    }

    public Integer getRoomStatId() {
        return roomStatId;
    }

    public void setRoomStatId(Integer roomStatId) {
        this.roomStatId = roomStatId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getDemandType() {
        return demandType;
    }

    public void setDemandType(String demandType) {
        this.demandType = demandType;
    }

    public Integer getCalculatedTemperature() {
        return calculatedTemperature;
    }

    public void setCalculatedTemperature(Integer calculatedTemperature) {
        this.calculatedTemperature = calculatedTemperature;
    }

    public Integer getCurrentSetPoint() {
        return currentSetPoint;
    }

    public void setCurrentSetPoint(Integer currentSetPoint) {
        this.currentSetPoint = currentSetPoint;
    }

    public Integer getPercentageDemand() {
        return percentageDemand;
    }

    public void setPercentageDemand(Integer percentageDemand) {
        this.percentageDemand = percentageDemand;
    }

    public String getControlOutputState() {
        return controlOutputState;
    }

    public void setControlOutputState(String controlOutputState) {
        this.controlOutputState = controlOutputState;
    }

    public Integer getDisplayedSetPoint() {
        return displayedSetPoint;
    }

    public void setDisplayedSetPoint(Integer displayedSetPoint) {
        this.displayedSetPoint = displayedSetPoint;
    }

}
