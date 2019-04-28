package org.pursuit.hackathon_8_money_talks.network;

import org.pursuit.hackathon_8_money_talks.models.high.DailyMetaDataWrapper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HighRiskApiCall {
    String ENDPOINT = "query";
    String FUNCTION = "function";
    String SYMBOL = "symbol";
    String API_KEY = "apikey";


    @GET(ENDPOINT)
    Call<DailyMetaDataWrapper> getDailyData(
            @Query(FUNCTION) String function,
            @Query(SYMBOL) String symbol,
            @Query(API_KEY) String apiKey);
}
