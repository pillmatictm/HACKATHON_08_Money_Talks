package org.pursuit.hackathon_8_money_talks.models.high;

import com.google.gson.annotations.SerializedName;

public class DailyTimeSeries {
    @SerializedName("2019-04-26")
    private DayData apr262018;
    @SerializedName("2019-04-25")
    private DayData apr252018;
    @SerializedName("2019-04-24")
    private DayData apr242018;
    @SerializedName("2019-04-23")
    private DayData apr232018;
    @SerializedName("2019-04-22")
    private DayData apr222018;
    @SerializedName("2019-04-21")
    private DayData apr212018;

    public DailyTimeSeries(DayData apr262018, DayData apr252018, DayData apr242018, DayData apr232018, DayData apr222018, DayData apr212018) {
        this.apr262018 = apr262018;
        this.apr252018 = apr252018;
        this.apr242018 = apr242018;
        this.apr232018 = apr232018;
        this.apr222018 = apr222018;
        this.apr212018 = apr212018;
    }

    public DayData getApr262018() {
        return apr262018;
    }

    public void setApr262018(DayData apr262018) {
        this.apr262018 = apr262018;
    }

    public DayData getApr252018() {
        return apr252018;
    }

    public void setApr252018(DayData apr252018) {
        this.apr252018 = apr252018;
    }

    public DayData getApr242018() {
        return apr242018;
    }

    public void setApr242018(DayData apr242018) {
        this.apr242018 = apr242018;
    }

    public DayData getApr232018() {
        return apr232018;
    }

    public void setApr232018(DayData apr232018) {
        this.apr232018 = apr232018;
    }

    public DayData getApr222018() {
        return apr222018;
    }

    public void setApr222018(DayData apr222018) {
        this.apr222018 = apr222018;
    }

    public DayData getApr212018() {
        return apr212018;
    }

    public void setApr212018(DayData apr212018) {
        this.apr212018 = apr212018;
    }
}
