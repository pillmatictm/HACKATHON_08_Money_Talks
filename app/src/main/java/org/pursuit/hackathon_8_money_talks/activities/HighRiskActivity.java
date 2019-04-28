package org.pursuit.hackathon_8_money_talks.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.pursuit.hackathon_8_money_talks.R;
import org.pursuit.hackathon_8_money_talks.models.moderate.MonthlyMetaDataWrapper;
import org.pursuit.hackathon_8_money_talks.network.ModerateApiCall;
import org.pursuit.hackathon_8_money_talks.network.RetrofitSingleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HighRiskActivity extends AppCompatActivity {
    private static final String TAG = "HighRiskActivity";
    final static String FUNCTION = "TIME_SERIES_DAILY";
    final static String SYMBOL = "MSFT";
    final static String API_KEY = "J49R2ZMT0QW07SUM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_risk);

        retrofitCall();
    }

    private void retrofitCall() {
            final Retrofit retrofit = RetrofitSingleton.getInstance();
            final ModerateApiCall moderateApiCall = retrofit.create(ModerateApiCall.class);
            moderateApiCall.getMonthlyData(FUNCTION,SYMBOL,API_KEY)
                    .enqueue(new Callback<MonthlyMetaDataWrapper>() {
                        @Override
                        public void onResponse(Call<MonthlyMetaDataWrapper> call, Response<MonthlyMetaDataWrapper> response) {
                            Log.d(TAG, "onResponse: HighRisk" + response.body());
                        }

                        @Override
                        public void onFailure(Call<MonthlyMetaDataWrapper> call, Throwable t) {

                        }
                    });
    }

}
