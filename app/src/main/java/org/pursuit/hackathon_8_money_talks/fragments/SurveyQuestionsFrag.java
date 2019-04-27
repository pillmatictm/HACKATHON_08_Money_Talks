package org.pursuit.hackathon_8_money_talks.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.hackathon_8_money_talks.R;

public class SurveyQuestionsFrag extends Fragment {


    public SurveyQuestionsFrag() {
        // Required empty public constructor
    }

    public static SurveyQuestionsFrag newInstance() {
        return new SurveyQuestionsFrag();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_survey_questions, container, false);
    }

}
