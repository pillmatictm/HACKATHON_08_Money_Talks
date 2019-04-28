package org.pursuit.hackathon_8_money_talks.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.pursuit.hackathon_8_money_talks.R;

public class LowRiskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_risk);

        TextView more = findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.bankrate.com/investing/low-risk-investments/");
                Intent moreIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(moreIntent);
            }
        });
    }
}
