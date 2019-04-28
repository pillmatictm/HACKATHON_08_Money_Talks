package org.pursuit.hackathon_8_money_talks.models.moderate;

import com.google.gson.annotations.SerializedName;

class MetaData {
    @SerializedName("1. Information")
    private String Information;
    @SerializedName("2. Symbol")
    private String Symbol;
    @SerializedName("3. Last Refreshed")
    private String LastRefreshed;
    @SerializedName("4. Time Zone")
    private String TimeZone;

    public MetaData(String information, String symbol, String lastRefreshed, String timeZone) {
        Information = information;
        Symbol = symbol;
        LastRefreshed = lastRefreshed;
        TimeZone = timeZone;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getLastRefreshed() {
        return LastRefreshed;
    }

    public void setLastRefreshed(String lastRefreshed) {
        LastRefreshed = lastRefreshed;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(String timeZone) {
        TimeZone = timeZone;
    }
}
