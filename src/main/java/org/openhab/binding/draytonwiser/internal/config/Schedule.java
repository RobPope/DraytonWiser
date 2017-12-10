
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Schedule {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("Monday")
    @Expose
    private Monday monday;
    @SerializedName("Tuesday")
    @Expose
    private Tuesday tuesday;
    @SerializedName("Wednesday")
    @Expose
    private Wednesday wednesday;
    @SerializedName("Thursday")
    @Expose
    private Thursday thursday;
    @SerializedName("Friday")
    @Expose
    private Friday friday;
    @SerializedName("Saturday")
    @Expose
    private Saturday saturday;
    @SerializedName("Sunday")
    @Expose
    private Sunday sunday;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("CurrentSetpoint")
    @Expose
    private Integer currentSetpoint;
    @SerializedName("NextEventTime")
    @Expose
    private Integer nextEventTime;
    @SerializedName("NextEventSetpoint")
    @Expose
    private Integer nextEventSetpoint;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Monday getMonday() {
        return monday;
    }

    public void setMonday(Monday monday) {
        this.monday = monday;
    }

    public Tuesday getTuesday() {
        return tuesday;
    }

    public void setTuesday(Tuesday tuesday) {
        this.tuesday = tuesday;
    }

    public Wednesday getWednesday() {
        return wednesday;
    }

    public void setWednesday(Wednesday wednesday) {
        this.wednesday = wednesday;
    }

    public Thursday getThursday() {
        return thursday;
    }

    public void setThursday(Thursday thursday) {
        this.thursday = thursday;
    }

    public Friday getFriday() {
        return friday;
    }

    public void setFriday(Friday friday) {
        this.friday = friday;
    }

    public Saturday getSaturday() {
        return saturday;
    }

    public void setSaturday(Saturday saturday) {
        this.saturday = saturday;
    }

    public Sunday getSunday() {
        return sunday;
    }

    public void setSunday(Sunday sunday) {
        this.sunday = sunday;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCurrentSetpoint() {
        return currentSetpoint;
    }

    public void setCurrentSetpoint(Integer currentSetpoint) {
        this.currentSetpoint = currentSetpoint;
    }

    public Integer getNextEventTime() {
        return nextEventTime;
    }

    public void setNextEventTime(Integer nextEventTime) {
        this.nextEventTime = nextEventTime;
    }

    public Integer getNextEventSetpoint() {
        return nextEventSetpoint;
    }

    public void setNextEventSetpoint(Integer nextEventSetpoint) {
        this.nextEventSetpoint = nextEventSetpoint;
    }

}
