package org.pursuit.hackathon_8_money_talks.models.moderate;

import com.google.gson.annotations.SerializedName;

public class MonthlyTimeSeries {
    @SerializedName("2018-11-30")
    private MonthData nov302018;
    @SerializedName("2018-12-31")
    private MonthData dec312018;
    @SerializedName("2019-01-31")
    private MonthData jan312019;
    @SerializedName("2019-02-28")
    private MonthData feb282019;
    @SerializedName("2019-03-29")
    private MonthData mar292019;
    @SerializedName("2019-04-26")
    private MonthData apr262019;

    public MonthlyTimeSeries(MonthData nov302018,
                             MonthData dec312018,
                             MonthData jan312019,
                             MonthData feb282019,
                             MonthData mar292019,
                             MonthData apr262019) {
        this.nov302018 = nov302018;
        this.dec312018 = dec312018;
        this.jan312019 = jan312019;
        this.feb282019 = feb282019;
        this.mar292019 = mar292019;
        this.apr262019 = apr262019;
    }

    public MonthData getNov302018() {
        return nov302018;
    }

    public MonthData getDec312018() {
        return dec312018;
    }

    public MonthData getJan312019() {
        return jan312019;
    }

    public MonthData getFeb282019() {
        return feb282019;
    }

    public MonthData getMar292019() {
        return mar292019;
    }

    public MonthData getApr262019() {
        return apr262019;
    }
}
