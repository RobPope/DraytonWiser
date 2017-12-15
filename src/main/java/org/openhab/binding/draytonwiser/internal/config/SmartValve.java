
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SmartValve {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("SetPoint")
    @Expose
    public Integer setPoint;
    @SerializedName("MeasuredTemperature")
    @Expose
    public Integer measuredTemperature;
    @SerializedName("PercentageDemand")
    @Expose
    public Integer percentageDemand;
    @SerializedName("WindowState")
    @Expose
    public String windowState;

}
