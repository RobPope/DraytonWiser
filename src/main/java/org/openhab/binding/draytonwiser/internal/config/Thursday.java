
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thursday {

    @SerializedName("SetPoints")
    @Expose
    private List<SetPoint___> setPoints = null;

    public List<SetPoint___> getSetPoints() {
        return setPoints;
    }

    public void setSetPoints(List<SetPoint___> setPoints) {
        this.setPoints = setPoints;
    }

}
