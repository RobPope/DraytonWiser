
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wednesday {

    @SerializedName("SetPoints")
    @Expose
    private List<SetPoint__> setPoints = null;

    public List<SetPoint__> getSetPoints() {
        return setPoints;
    }

    public void setSetPoints(List<SetPoint__> setPoints) {
        this.setPoints = setPoints;
    }

}
