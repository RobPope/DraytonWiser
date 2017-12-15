
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SetPoint__ {

    @SerializedName("Time")
    @Expose
    public Integer time;
    @SerializedName("DegreesC")
    @Expose
    public Integer degreesC;

}
