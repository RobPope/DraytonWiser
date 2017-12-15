
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Device {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("ProductType")
    @Expose
    public String productType;
    @SerializedName("ProductIdentifier")
    @Expose
    public String productIdentifier;
    @SerializedName("ActiveFirmwareVersion")
    @Expose
    public String activeFirmwareVersion;
    @SerializedName("Manufacturer")
    @Expose
    public String manufacturer;
    @SerializedName("ModelIdentifier")
    @Expose
    public String modelIdentifier;
    @SerializedName("DisplayedSignalStrength")
    @Expose
    public String displayedSignalStrength;
    @SerializedName("HardwareVersion")
    @Expose
    public String hardwareVersion;
    @SerializedName("SerialNumber")
    @Expose
    public String serialNumber;
    @SerializedName("ProductRange")
    @Expose
    public String productRange;
    @SerializedName("ProductModel")
    @Expose
    public String productModel;
    @SerializedName("ProductFamily")
    @Expose
    public String productFamily;
    @SerializedName("OtaImageQueryCount")
    @Expose
    public Integer otaImageQueryCount;
    @SerializedName("LastOtaImageQueryCount")
    @Expose
    public Integer lastOtaImageQueryCount;
    @SerializedName("BatteryVoltage")
    @Expose
    public Integer batteryVoltage;
    @SerializedName("BatteryLevel")
    @Expose
    public String batteryLevel;
    @SerializedName("Rssi")
    @Expose
    public Integer rssi;
    @SerializedName("Lqi")
    @Expose
    public Integer lqi;
    @SerializedName("OtaLastImageSentBytes")
    @Expose
    public Integer otaLastImageSentBytes;
    @SerializedName("PendingZigbeeMessageMask")
    @Expose
    public Integer pendingZigbeeMessageMask;

}
