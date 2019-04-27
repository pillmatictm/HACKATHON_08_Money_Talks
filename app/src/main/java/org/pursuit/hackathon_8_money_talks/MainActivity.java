package org.pursuit.hackathon_8_money_talks;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.pursuit.hackathon_8_money_talks.fragments.FragmentInterface;
import org.pursuit.hackathon_8_money_talks.fragments.SurveyQuestionsFrag;

public class MainActivity extends AppCompatActivity implements FragmentInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void startQuestionaireFrag() {
    final Fragment surveyQuestionsFragment = SurveyQuestionsFrag.newInstance();
    inflateFragment(surveyQuestionsFragment);
    }

    private void inflateFragment(@NonNull Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
