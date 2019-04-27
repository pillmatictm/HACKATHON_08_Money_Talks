package org.pursuit.hackathon_8_money_talks.fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import org.pursuit.hackathon_8_money_talks.R;
import org.pursuit.hackathon_8_money_talks.activities.HighRiskActivity;
import org.pursuit.hackathon_8_money_talks.activities.LowRiskActivity;
import org.pursuit.hackathon_8_money_talks.activities.ModerateRiskActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    RadioButton lowRisk, moderateRisk, highRisk, idk;
    TextView selectARisk;
    Button submitButton;
    FragmentInterface fragmentInterface;


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragmentInterface = (FragmentInterface) context;
    }

    public static Fragment newInstance() {
        final MainFragment mainFragment = new MainFragment();
        return mainFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        selectARisk = view.findViewById(R.id.main_fragment_risk_selection);
        lowRisk = view.findViewById(R.id.low_risk);
        moderateRisk = view.findViewById(R.id.moderate_risk);
        highRisk = view.findViewById(R.id.high_risk);
        idk = view.findViewById(R.id.dont_know);
        submitButton = view.findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        if (lowRisk.isChecked()){
            Intent intent = new Intent(v.getContext(), LowRiskActivity.class);
            startActivity(intent);

        } else if (moderateRisk.isChecked()){
            Intent intent = new Intent(v.getContext(), ModerateRiskActivity.class);
            startActivity(intent);
        } else if (highRisk.isChecked()){
            Intent intent = new Intent(v.getContext(), HighRiskActivity.class);
            startActivity(intent);
        }else if (idk.isChecked()){
            fragmentInterface.startQuestionaireFrag();
        }
            }
        });

    }
}
