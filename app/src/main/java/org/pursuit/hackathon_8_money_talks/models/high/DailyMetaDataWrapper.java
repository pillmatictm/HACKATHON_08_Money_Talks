package org.pursuit.hackathon_8_money_talks.models.high;

import com.google.gson.annotations.SerializedName;

public class DailyMetaDataWrapper {
    @SerializedName("Meta Data")
    private MetaData metaData;
    @SerializedName("Time Series (Daily)")
    private DailyTimeSeries dailyTimeSeries;

    public MetaData getMetaData() {
        return metaData;
    }
    public DailyTimeSeries getDailyTimeSeries() {
        return dailyTimeSeries;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public void setDailyTimeSeries(DailyTimeSeries dailyTimeSeries) {
        this.dailyTimeSeries = dailyTimeSeries;
    }
}
