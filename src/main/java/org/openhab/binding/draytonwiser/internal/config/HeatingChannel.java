
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeatingChannel {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("Name")
    @Expose
    public String name;
    @SerializedName("RoomIds")
    @Expose
    public List<Integer> roomIds = null;
    @SerializedName("PercentageDemand")
    @Expose
    public Integer percentageDemand;
    @SerializedName("DemandOnOffOutput")
    @Expose
    public String demandOnOffOutput;
    @SerializedName("HeatingRelayState")
    @Expose
    public String heatingRelayState;
    @SerializedName("IsSmartValvePreventingDemand")
    @Expose
    public Boolean isSmartValvePreventingDemand;

}
