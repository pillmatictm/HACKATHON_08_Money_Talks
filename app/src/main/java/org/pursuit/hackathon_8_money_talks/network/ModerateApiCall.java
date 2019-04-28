package org.pursuit.hackathon_8_money_talks.network;

import org.pursuit.hackathon_8_money_talks.models.moderate.MonthlyMetaDataWrapper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ModerateApiCall {

    String ENDPOINT = "query";
    String FUNCTION = "function";
    String SYMBOL = "symbol";
    String API_KEY = "apikey";


    @GET(ENDPOINT)
    Call<MonthlyMetaDataWrapper> getMonthlyData(
            @Query(FUNCTION) String function,
            @Query(SYMBOL) String symbol,
            @Query(API_KEY) String apiKey);



}
