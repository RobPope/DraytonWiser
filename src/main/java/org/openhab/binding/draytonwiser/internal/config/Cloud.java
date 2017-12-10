
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cloud {

    @SerializedName("Environment")
    @Expose
    private String environment;
    @SerializedName("WiserApiHost")
    @Expose
    private String wiserApiHost;
    @SerializedName("BootStrapApiHost")
    @Expose
    private String bootStrapApiHost;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getWiserApiHost() {
        return wiserApiHost;
    }

    public void setWiserApiHost(String wiserApiHost) {
        this.wiserApiHost = wiserApiHost;
    }

    public String getBootStrapApiHost() {
        return bootStrapApiHost;
    }

    public void setBootStrapApiHost(String bootStrapApiHost) {
        this.bootStrapApiHost = bootStrapApiHost;
    }

}
