package org.pursuit.hackathon_8_money_talks.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.pursuit.hackathon_8_money_talks.R;

public class SurveyResponseFrag extends Fragment {
    private FragmentInterface fragmentInterface;
    private CardView progressCard;
    private ProgressBar progressBar;
    private TextView progressText;


    public SurveyResponseFrag() {
        // Required empty public constructor
    }

    public static SurveyResponseFrag newInstance() {
        return new SurveyResponseFrag();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentInterface) {
            fragmentInterface = (FragmentInterface) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement FragmentInterface");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_survey_response, container, false);
        progressCard = rootView.findViewById(R.id.progress_card);
        progressBar = rootView.findViewById(R.id.progress_circular);
        progressText = rootView.findViewById(R.id.progress_text);
        progressBar.isIndeterminate();
        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                progressCard.setVisibility(View.GONE);
                progressBar.setVisibility(View.GONE);
                progressText.setVisibility(View.GONE);
            }
        }, secondsDelayed * 3500);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
