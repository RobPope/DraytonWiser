
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpgradeInfo {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("FirmwareFilename")
    @Expose
    private String firmwareFilename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirmwareFilename() {
        return firmwareFilename;
    }

    public void setFirmwareFilename(String firmwareFilename) {
        this.firmwareFilename = firmwareFilename;
    }

}
