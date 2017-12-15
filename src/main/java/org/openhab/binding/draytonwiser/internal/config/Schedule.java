
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Schedule {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("Monday")
    @Expose
    public Monday monday;
    @SerializedName("Tuesday")
    @Expose
    public Tuesday tuesday;
    @SerializedName("Wednesday")
    @Expose
    public Wednesday wednesday;
    @SerializedName("Thursday")
    @Expose
    public Thursday thursday;
    @SerializedName("Friday")
    @Expose
    public Friday friday;
    @SerializedName("Saturday")
    @Expose
    public Saturday saturday;
    @SerializedName("Sunday")
    @Expose
    public Sunday sunday;
    @SerializedName("Type")
    @Expose
    public String type;
    @SerializedName("CurrentSetpoint")
    @Expose
    public Integer currentSetpoint;
    @SerializedName("NextEventTime")
    @Expose
    public Integer nextEventTime;
    @SerializedName("NextEventSetpoint")
    @Expose
    public Integer nextEventSetpoint;

}
