
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BoilerSettings {

    @SerializedName("ControlType")
    @Expose
    public String controlType;
    @SerializedName("FuelType")
    @Expose
    public String fuelType;
    @SerializedName("CycleRate")
    @Expose
    public String cycleRate;

}
