
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PublishRequests {

    @SerializedName("RoomTimeSeries")
    @Expose
    public Boolean roomTimeSeries;
    @SerializedName("EcoMode")
    @Expose
    public Boolean ecoMode;
    @SerializedName("BoilerOnOffEvent")
    @Expose
    public Boolean boilerOnOffEvent;
    @SerializedName("PercentageDemand")
    @Expose
    public Boolean percentageDemand;
    @SerializedName("ZigbeeDebug")
    @Expose
    public Boolean zigbeeDebug;
    @SerializedName("FotaProgress")
    @Expose
    public Boolean fotaProgress;
    @SerializedName("SupportPackage")
    @Expose
    public Boolean supportPackage;
    @SerializedName("PairingToken")
    @Expose
    public Boolean pairingToken;
    @SerializedName("Notification")
    @Expose
    public Boolean notification;

}
