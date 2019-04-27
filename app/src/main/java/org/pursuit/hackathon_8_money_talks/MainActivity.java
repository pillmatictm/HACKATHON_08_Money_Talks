package org.pursuit.hackathon_8_money_talks;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.pursuit.hackathon_8_money_talks.fragments.FragmentInterface;
import org.pursuit.hackathon_8_money_talks.fragments.FrequentlyAskedQuestions;
import org.pursuit.hackathon_8_money_talks.fragments.MainFragment;
import org.pursuit.hackathon_8_money_talks.fragments.SurveyQuestionsFrag;
import org.pursuit.hackathon_8_money_talks.fragments.SurveyResponseFrag;

public class MainActivity extends AppCompatActivity implements FragmentInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startMainFrag();
    }

    @Override
    public void startMainFrag() {
    final Fragment mainFragment = MainFragment.newInstance();
    inflateFragment(mainFragment);
    }

    @Override
    public void startQuestionaireFrag() {
        final Fragment surveyQuestionsFragment = SurveyQuestionsFrag.newInstance();
        inflateFragment(surveyQuestionsFragment);
    }

    @Override
    public void startResponseFrag() {
        final Fragment responseFragment = SurveyResponseFrag.newInstance();
        inflateFragment(responseFragment);

    }

    @Override
    public void startFaqFrag() {
        final Fragment faqFragment = FrequentlyAskedQuestions.newInstance();
        inflateFragment(faqFragment);
    }

        private void inflateFragment (@NonNull Fragment fragment){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
        }
    }

