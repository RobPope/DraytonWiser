
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Monday {

    @SerializedName("SetPoints")
    @Expose
    private List<SetPoint> setPoints = null;

    public List<SetPoint> getSetPoints() {
        return setPoints;
    }

    public void setSetPoints(List<SetPoint> setPoints) {
        this.setPoints = setPoints;
    }

}
