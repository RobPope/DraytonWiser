
package org.openhab.binding.draytonwiser.internal.config;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cloud {

    @SerializedName("Environment")
    @Expose
    public String environment;
    @SerializedName("WiserApiHost")
    @Expose
    public String wiserApiHost;
    @SerializedName("BootStrapApiHost")
    @Expose
    public String bootStrapApiHost;
    @SerializedName("PublishRequests")
    @Expose
    public PublishRequests publishRequests;
    @SerializedName("ScheduleIdsToPublish")
    @Expose
    public List<Object> scheduleIdsToPublish = null;

}
