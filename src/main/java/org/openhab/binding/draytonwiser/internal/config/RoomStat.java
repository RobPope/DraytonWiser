
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomStat {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("SetPoint")
    @Expose
    public Integer setPoint;
    @SerializedName("MeasuredTemperature")
    @Expose
    public Integer measuredTemperature;
    @SerializedName("MeasuredHumidity")
    @Expose
    public Integer measuredHumidity;

}
