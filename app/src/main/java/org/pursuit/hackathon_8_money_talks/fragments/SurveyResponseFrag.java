package org.pursuit.hackathon_8_money_talks.fragments;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import org.pursuit.hackathon_8_money_talks.R;

public class SurveyResponseFrag extends Fragment {
    private FragmentInterface fragmentInterface;
    private CardView progressCard;
    private ProgressBar progressBar;
    private TextView progressText;
    private TextView resultText;
    private Button returnHome;
    public MediaPlayer mMediaPlayer;
    public int mCurrentVideoPosition;
    private String results;


    public SurveyResponseFrag() {
        // Required empty public constructor
    }

    public static SurveyResponseFrag newInstance(String result) {
        SurveyResponseFrag responseFrag = new SurveyResponseFrag();
        responseFrag.results = result;
        return responseFrag;
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
        resultText = rootView.findViewById(R.id.riskResult_text);
        returnHome = rootView.findViewById(R.id.returnHome_button);
        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentInterface.startMainFrag();
            }
        });

        resultText.setVisibility(View.INVISIBLE);
        returnHome.setVisibility(View.INVISIBLE);


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
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int secondsDelayed = 1;
        final VideoView videoBG = view.findViewById(R.id.videoView);
        final TextView headingText = view.findViewById(R.id.result_header);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                String resultString = getString(R.string.riskResult_text) + "\n" + results;
                headingText.setText(getString(R.string.results_heading));
                returnHome.setVisibility(View.VISIBLE);
                resultText.setVisibility(View.VISIBLE);
                resultText.setText(resultString);


                Uri uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.money_background);
                videoBG.setVideoURI(uri);
                videoBG.start();
                videoBG.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mMediaPlayer = mediaPlayer;
                        mMediaPlayer.setLooping(true);
                        if (mCurrentVideoPosition != 0) {
                            mMediaPlayer.seekTo(mCurrentVideoPosition);
                            mMediaPlayer.start();
                        }
                    }
                });
            }
        }, secondsDelayed * 3700);
    }
}
