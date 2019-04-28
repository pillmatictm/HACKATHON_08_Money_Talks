package org.pursuit.hackathon_8_money_talks.models.moderate;

import com.google.gson.annotations.SerializedName;

public class MetaDataWrapper {
    @SerializedName("Meta Data")
    private MetaData metaData;
    @SerializedName("Monthly Time Series")
    private MonthlyTimeSeries monthlyTimeSeries;

    public MetaDataWrapper(MetaData metaData, MonthlyTimeSeries monthlyTimeSeries) {
        this.metaData = metaData;
        this.monthlyTimeSeries = monthlyTimeSeries;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public MonthlyTimeSeries getMonthlyTimeSeries() {
        return monthlyTimeSeries;
    }

    public void setMonthlyTimeSeries(MonthlyTimeSeries monthlyTimeSeries) {
        this.monthlyTimeSeries = monthlyTimeSeries;
    }


}