
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpgradeInfo {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("FirmwareFilename")
    @Expose
    public String firmwareFilename;

}
