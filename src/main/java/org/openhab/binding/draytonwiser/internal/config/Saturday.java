
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Saturday {

    @SerializedName("SetPoints")
    @Expose
    private List<SetPoint_____> setPoints = null;

    public List<SetPoint_____> getSetPoints() {
        return setPoints;
    }

    public void setSetPoints(List<SetPoint_____> setPoints) {
        this.setPoints = setPoints;
    }

}
