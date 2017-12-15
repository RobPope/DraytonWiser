
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tuesday {

    @SerializedName("SetPoints")
    @Expose
    public List<SetPoint_> setPoints = null;

}
