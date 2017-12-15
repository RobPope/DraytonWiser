
package org.openhab.binding.draytonwiser.internal.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocalDateAndTime {

    @SerializedName("Year")
    @Expose
    public Integer year;
    @SerializedName("Month")
    @Expose
    public String month;
    @SerializedName("Date")
    @Expose
    public Integer date;
    @SerializedName("Day")
    @Expose
    public String day;
    @SerializedName("Time")
    @Expose
    public Integer time;

}
