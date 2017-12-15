
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Room {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("OverrideType")
    @Expose
    public String overrideType;
    @SerializedName("OverrideSetpoint")
    @Expose
    public Integer overrideSetpoint;
    @SerializedName("RoomStatId")
    @Expose
    public Integer roomStatId;
    @SerializedName("ScheduleId")
    @Expose
    public Integer scheduleId;
    @SerializedName("Name")
    @Expose
    public String name;
    @SerializedName("Mode")
    @Expose
    public String mode;
    @SerializedName("DemandType")
    @Expose
    public String demandType;
    @SerializedName("CalculatedTemperature")
    @Expose
    public Integer calculatedTemperature;
    @SerializedName("CurrentSetPoint")
    @Expose
    public Integer currentSetPoint;
    @SerializedName("PercentageDemand")
    @Expose
    public Integer percentageDemand;
    @SerializedName("ControlOutputState")
    @Expose
    public String controlOutputState;
    @SerializedName("DisplayedSetPoint")
    @Expose
    public Integer displayedSetPoint;
    @SerializedName("SmartValveIds")
    @Expose
    public List<Integer> smartValveIds = null;
    @SerializedName("WindowState")
    @Expose
    public String windowState;

}
