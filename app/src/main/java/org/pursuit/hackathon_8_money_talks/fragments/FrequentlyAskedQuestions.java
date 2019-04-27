package org.pursuit.hackathon_8_money_talks.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.hackathon_8_money_talks.R;

import java.util.ArrayList;
import java.util.List;

public class FrequentlyAskedQuestions extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    List<String> faqQuestions = new ArrayList<>();
    List<String> faqAnswers = new ArrayList<>();


    public FrequentlyAskedQuestions() { }

    public static FrequentlyAskedQuestions newInstance() {
        FrequentlyAskedQuestions fragment = new FrequentlyAskedQuestions();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        faqQuestions.add("");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_frequently_asked_questions, container, false);
    }

}
