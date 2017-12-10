
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Friday {

    @SerializedName("SetPoints")
    @Expose
    private List<SetPoint____> setPoints = null;

    public List<SetPoint____> getSetPoints() {
        return setPoints;
    }

    public void setSetPoints(List<SetPoint____> setPoints) {
        this.setPoints = setPoints;
    }

}
