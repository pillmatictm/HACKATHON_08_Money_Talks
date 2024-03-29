package org.pursuit.hackathon_8_money_talks;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
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
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getResources().getString(R.string.toolbar_title));

        startMainFrag();
    }

    @Override
    public void startMainFrag() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, MainFragment.newInstance())
                .commit();
    }

    @Override
    public void startQuestionaireFrag() {
        final Fragment surveyQuestionsFragment = SurveyQuestionsFrag.newInstance();
        inflateFragment(surveyQuestionsFragment);
    }

    @Override
    public void startResponseFrag(String result) {
        final Fragment responseFragment = SurveyResponseFrag.newInstance(result);
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

