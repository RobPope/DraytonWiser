
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class System {

    @SerializedName("PairingStatus")
    @Expose
    public String pairingStatus;
    @SerializedName("TimeZoneOffset")
    @Expose
    public Integer timeZoneOffset;
    @SerializedName("AutomaticDaylightSaving")
    @Expose
    public Boolean automaticDaylightSaving;
    @SerializedName("Version")
    @Expose
    public Integer version;
    @SerializedName("FotaEnabled")
    @Expose
    public Boolean fotaEnabled;
    @SerializedName("ValveProtectionEnabled")
    @Expose
    public Boolean valveProtectionEnabled;
    @SerializedName("EcoModeEnabled")
    @Expose
    public Boolean ecoModeEnabled;
    @SerializedName("BoilerSettings")
    @Expose
    public BoilerSettings boilerSettings;
    @SerializedName("UnixTime")
    @Expose
    public Integer unixTime;
    @SerializedName("CloudConnectionStatus")
    @Expose
    public String cloudConnectionStatus;
    @SerializedName("ZigbeeModuleVersion")
    @Expose
    public String zigbeeModuleVersion;
    @SerializedName("ZigbeeEui")
    @Expose
    public String zigbeeEui;
    @SerializedName("LocalDateAndTime")
    @Expose
    public LocalDateAndTime localDateAndTime;
    @SerializedName("HeatingButtonOverrideState")
    @Expose
    public String heatingButtonOverrideState;
    @SerializedName("HotWaterButtonOverrideState")
    @Expose
    public String hotWaterButtonOverrideState;

}
