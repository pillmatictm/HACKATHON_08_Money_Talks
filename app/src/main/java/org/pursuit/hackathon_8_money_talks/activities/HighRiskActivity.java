
package org.pursuit.hackathon_8_money_talks.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.pursuit.hackathon_8_money_talks.R;
import org.pursuit.hackathon_8_money_talks.models.high.DailyMetaDataWrapper;
import org.pursuit.hackathon_8_money_talks.models.high.DayData;
import org.pursuit.hackathon_8_money_talks.network.HighRiskApiCall;
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
    private TextView apr262019textView;
    private TextView apr252019textView;
    private TextView apr242019textView;
    private TextView apr232019textView;
    private TextView apr222019textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_risk);
        apr222019textView = findViewById(R.id.high_risk_day1);
        apr232019textView = findViewById(R.id.high_risk_day2);
        apr242019textView = findViewById(R.id.high_risk_day3);
        apr252019textView = findViewById(R.id.high_risk_day4);
        apr262019textView = findViewById(R.id.high_risk_day5);

        retrofitCall();
    }

    private void retrofitCall() {
        final Retrofit retrofit = RetrofitSingleton.getInstance();
        final HighRiskApiCall highRiskApiCall = retrofit.create(HighRiskApiCall.class);
        highRiskApiCall.getDailyData(FUNCTION,SYMBOL,API_KEY)
                .enqueue(new Callback<DailyMetaDataWrapper>() {
                    @Override
                    public void onResponse(Call<DailyMetaDataWrapper> call, Response<DailyMetaDataWrapper> response) {
                        DayData apr262019 = response.body().getDailyTimeSeries().getApr262018();
                        String Apr26 = "April 26th "+"\nOpen: " + apr262019.getOpen() + "\n" + "Close: " +apr262019.getClose() + "\n" + "High: " + apr262019.getHigh() + "\n" + "Low: " +apr262019.getLow();
                        apr262019textView.setText(Apr26);

                        DayData apr252019 = response.body().getDailyTimeSeries().getApr262018();
                        String Apr25 = "April 25th "+ "\nOpen: " + apr252019.getOpen() + "\n" + "Close: " +apr252019.getClose() + "\n" + "High: " + apr252019.getHigh() + "\n" + "Low: " +apr252019.getLow();
                        apr252019textView.setText(Apr25);

                        DayData apr242019 = response.body().getDailyTimeSeries().getApr262018();
                        String Apr24 = "April 24th "+ "\nOpen: " + apr242019.getOpen() + "\n" + "Close: " +apr242019.getClose() + "\n" + "High: " + apr242019.getHigh() + "\n" + "Low: " +apr242019.getLow();
                        apr242019textView.setText(Apr24);

                        DayData apr232019 = response.body().getDailyTimeSeries().getApr262018();
                        String Apr23 = "April 23th "+ "\nOpen: " + apr232019.getOpen() + "\n" + "Close: " +apr232019.getClose() + "\n" + "High: " + apr232019.getHigh() + "\n" + "Low: " +apr232019.getLow();
                        apr232019textView.setText(Apr23);

                        DayData apr222019 = response.body().getDailyTimeSeries().getApr262018();
                        String Apr22 = "April 22th "+ "\nOpen: " + apr222019.getOpen() + "\n" + "Close: " +apr222019.getClose() + "\n" + "High: " + apr222019.getHigh() + "\n" + "Low: " +apr222019.getLow();
                        apr222019textView.setText(Apr22);


                    }

                    @Override
                    public void onFailure(Call<DailyMetaDataWrapper> call, Throwable t) {

                    }
                });
    }

}