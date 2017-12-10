
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SetPoint____ {

    @SerializedName("Time")
    @Expose
    private Integer time;
    @SerializedName("DegreesC")
    @Expose
    private Integer degreesC;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getDegreesC() {
        return degreesC;
    }

    public void setDegreesC(Integer degreesC) {
        this.degreesC = degreesC;
    }

}
