
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tuesday {

    @SerializedName("SetPoints")
    @Expose
    private List<SetPoint_> setPoints = null;

    public List<SetPoint_> getSetPoints() {
        return setPoints;
    }

    public void setSetPoints(List<SetPoint_> setPoints) {
        this.setPoints = setPoints;
    }

}
