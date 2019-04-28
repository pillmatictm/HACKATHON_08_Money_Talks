package org.pursuit.hackathon_8_money_talks.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.pursuit.hackathon_8_money_talks.R;
import org.pursuit.hackathon_8_money_talks.models.moderate.MonthData;
import org.pursuit.hackathon_8_money_talks.models.moderate.MonthlyMetaDataWrapper;
import org.pursuit.hackathon_8_money_talks.network.ModerateApiCall;
import org.pursuit.hackathon_8_money_talks.network.RetrofitSingleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ModerateRiskActivity extends AppCompatActivity {
    private static final String TAG = "ModerateRiskActivity";
    final static String FUNCTION = "TIME_SERIES_MONTHLY";
    final static String SYMBOL = "MSFT";
    final static String API_KEY = "J49R2ZMT0QW07SUM";
    private TextView april;
    private TextView march;
    private TextView february;
    private TextView january;
    private TextView december;
    private TextView november;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moderate_risk);
        Log.d(TAG, "onCreate: before");
        april = findViewById(R.id.moderate_risk_activity_month_6);
        march = findViewById(R.id.moderate_risk_activity_month_5);
        february = findViewById(R.id.moderate_risk_activity_month_4);
        january = findViewById(R.id.moderate_risk_activity_month_3);
        december = findViewById(R.id.moderate_risk_activity_month_2);
        november = findViewById(R.id.moderate_risk_activity_month_1);
        Log.d(TAG, "onCreate: before");
        retrofitCall();

    }

    private void retrofitCall() {
        Log.d(TAG, "retrofitCall: Anything");
        final Retrofit retrofit = RetrofitSingleton.getInstance();
        final ModerateApiCall moderateApiCall = retrofit.create(ModerateApiCall.class);
        moderateApiCall.getMonthlyData(FUNCTION,SYMBOL,API_KEY)
                .enqueue(new Callback<MonthlyMetaDataWrapper>() {
                    @Override
                    public void onResponse(Call<MonthlyMetaDataWrapper> call, Response<MonthlyMetaDataWrapper> response) {
                        Log.d(TAG, "onResponse: Moderate" + response.body());
                        MonthData apr262019 = response.body().getMonthlyTimeSeries().getApr262019();
                        String Apr = "April" + "\nOpen: " + apr262019.getOpen() + "     " + "Close: " +apr262019.getClose() + "\n" + "Low: " + apr262019.getLow() + "       " + "High: " +apr262019.getHigh();
                        april.setText(Apr);

                        MonthData mar262019 = response.body().getMonthlyTimeSeries().getApr262019();
                        String Mar = "March" + "\nOpen: " + mar262019.getOpen() + "     " + "Close: " +mar262019.getClose() + "\n" + "Low: " + mar262019.getLow() + "       " + "High: " +mar262019.getHigh();
                        march.setText(Mar);

                        MonthData feb262019 = response.body().getMonthlyTimeSeries().getApr262019();
                        String Feb = "February" + "\nOpen: " + feb262019.getOpen() + "     " + "Close: " +feb262019.getClose() + "\n" + "Low: " + feb262019.getLow() + "       " + "High: " +feb262019.getHigh();
                        february.setText(Feb);

                        MonthData jan262019 = response.body().getMonthlyTimeSeries().getApr262019();
                        String Jan = "January" + "\nOpen: " + jan262019.getOpen() + "     " + "Close: " +jan262019.getClose() + "\n" + "Low: " + jan262019.getLow() + "       " + "High: " +jan262019.getHigh();
                        january.setText(Jan);

                        MonthData dec262019 = response.body().getMonthlyTimeSeries().getApr262019();
                        String Dec = "December" + "\nOpen: " + dec262019.getOpen() + "     " + "Close: " +dec262019.getClose() + "\n" + "Low: " + dec262019.getLow() + "       " + "High: " +dec262019.getHigh();
                        december.setText(Dec);

                        MonthData nov262019 = response.body().getMonthlyTimeSeries().getApr262019();
                        String Nov = "November" + "\nOpen: " + nov262019.getOpen() + "     " + "Close: " +nov262019.getClose() + "\n" + "Low: " + nov262019.getLow() + "       " + "High: " +nov262019.getHigh();
                        november.setText(Nov);


                    }


                    @Override
                    public void onFailure(Call<MonthlyMetaDataWrapper> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());
                    }
                });
    }
}
