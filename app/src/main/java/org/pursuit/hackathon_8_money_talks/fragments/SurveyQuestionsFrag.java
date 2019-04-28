package org.pursuit.hackathon_8_money_talks.fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.pursuit.hackathon_8_money_talks.R;
import org.pursuit.hackathon_8_money_talks.survey.Answer;
import org.pursuit.hackathon_8_money_talks.survey.Question;
import org.pursuit.hackathon_8_money_talks.survey.RiskLevel;

public class SurveyQuestionsFrag extends Fragment {
    private FragmentInterface fragmentInterface;

    public static int low = 0;
    public static int med = 0;
    public static int high = 0;
    public static Question[] surveyQuestions;

    private Button submitButton;

    private TextView question01;
    private TextView question02;
    private TextView question03;
    private TextView question04;
    private TextView question05;
    private TextView question06;
    private TextView question07;
    private TextView question08;
    private TextView question09;
    private TextView question10;


    private RadioButton choice01_optionA;
    private RadioButton choice01_optionB;
    private RadioButton choice01_optionC;
    private RadioButton choice01_optionD;

    private RadioButton choice02_optionA;
    private RadioButton choice02_optionB;
    private RadioButton choice02_optionC;
    private RadioButton choice02_optionD;

    private RadioButton choice03_optionA;
    private RadioButton choice03_optionB;
    private RadioButton choice03_optionC;
    private RadioButton choice03_optionD;

    private RadioButton choice04_optionA;
    private RadioButton choice04_optionB;
    private RadioButton choice04_optionC;
    private RadioButton choice04_optionD;

    private RadioButton choice05_optionA;
    private RadioButton choice05_optionB;
    private RadioButton choice05_optionC;
    private RadioButton choice05_optionD;

    private RadioButton choice06_optionA;
    private RadioButton choice06_optionB;

    private RadioButton choice07_optionA;
    private RadioButton choice07_optionB;
    private RadioButton choice07_optionC;

    private RadioButton choice08_optionA;
    private RadioButton choice08_optionB;
    private RadioButton choice08_optionC;
    private RadioButton choice08_optionD;
    private RadioButton choice08_optionE;

    private RadioButton choice09_optionA;
    private RadioButton choice09_optionB;
    private RadioButton choice09_optionC;
    private RadioButton choice09_optionD;

    private RadioButton choice10_optionA;
    private RadioButton choice10_optionB;
    private RadioButton choice10_optionC;
    private RadioButton choice10_optionD;


    public SurveyQuestionsFrag() {
        // Required empty public constructor
    }

    public static SurveyQuestionsFrag newInstance() {
        return new SurveyQuestionsFrag();
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
        return inflater.inflate(R.layout.fragment_survey_questions, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        findViews(view);
        setViews();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentInterface.startResponseFrag();
            }
        });
    }


    private void setViews() {
        question01.setText(getString(R.string.question01));
        question02.setText(getString(R.string.question02));
        question03.setText(getString(R.string.question03));
        question04.setText(getString(R.string.question04));
        question05.setText(getString(R.string.question05));
        question06.setText(getString(R.string.question06));
        question07.setText(getString(R.string.question07));
        question08.setText(getString(R.string.question08));
        question09.setText(getString(R.string.question09));
        question10.setText(getString(R.string.question10));


        choice01_optionA.setText(getString(R.string.q01_choice1));
        choice01_optionB.setText(getString(R.string.q01_choice2));
        choice01_optionC.setText(getString(R.string.q01_choice3));
        choice01_optionD.setText(getString(R.string.q01_choice4));

        choice02_optionA.setText(getString(R.string.q02_choice1));
        choice02_optionB.setText(getString(R.string.q02_choice2));
        choice02_optionC.setText(getString(R.string.q02_choice3));
        choice02_optionD.setText(getString(R.string.q02_choice4));

        choice03_optionA.setText(getString(R.string.q03_choice1));
        choice03_optionB.setText(getString(R.string.q03_choice2));
        choice03_optionC.setText(getString(R.string.q03_choice3));
        choice03_optionD.setText(getString(R.string.q03_choice4));

        choice04_optionA.setText(getString(R.string.q04_choice1));
        choice04_optionB.setText(getString(R.string.q04_choice2));
        choice04_optionC.setText(getString(R.string.q04_choice3));
        choice04_optionD.setText(getString(R.string.q04_choice4));

        choice05_optionA.setText(getString(R.string.q05_choice1));
        choice05_optionB.setText(getString(R.string.q05_choice2));
        choice05_optionC.setText(getString(R.string.q05_choice3));
        choice05_optionD.setText(getString(R.string.q05_choice4));

        choice06_optionA.setText(getString(R.string.q06_choice1));
        choice06_optionB.setText(getString(R.string.q06_choice2));

        choice07_optionA.setText(getString(R.string.q07_choice1));
        choice07_optionB.setText(getString(R.string.q07_choice2));
        choice07_optionC.setText(getString(R.string.q07_choice3));

        choice08_optionA.setText(getString(R.string.q08_choice1));
        choice08_optionB.setText(getString(R.string.q08_choice2));
        choice08_optionC.setText(getString(R.string.q08_choice3));
        choice08_optionD.setText(getString(R.string.q08_choice4));
        choice08_optionE.setText(getString(R.string.q08_choice5));

        choice09_optionA.setText(getString(R.string.q09_choice1));
        choice09_optionB.setText(getString(R.string.q09_choice2));
        choice09_optionC.setText(getString(R.string.q09_choice3));
        choice09_optionD.setText(getString(R.string.q09_choice4));

        choice10_optionA.setText(getString(R.string.q10_choice1));
        choice10_optionB.setText(getString(R.string.q10_choice2));
        choice10_optionC.setText(getString(R.string.q10_choice3));
        choice10_optionD.setText(getString(R.string.q10_choice4));
    }


    private void findViews(@NonNull View view) {
        submitButton = view.findViewById(R.id.submit_button);

        question01 = view.findViewById(R.id.question01_text);
        question02 = view.findViewById(R.id.question02_text);
        question03 = view.findViewById(R.id.question03_text);
        question04 = view.findViewById(R.id.question04_text);
        question05 = view.findViewById(R.id.question05_text);
        question06 = view.findViewById(R.id.question06_text);
        question07 = view.findViewById(R.id.question07_text);
        question08 = view.findViewById(R.id.question08_text);
        question09 = view.findViewById(R.id.question09_text);
        question10 = view.findViewById(R.id.question10_text);


        choice01_optionA = view.findViewById(R.id.choices01_optionA);
        choice01_optionB = view.findViewById(R.id.choices01_optionB);
        choice01_optionC = view.findViewById(R.id.choices01_optionC);
        choice01_optionD = view.findViewById(R.id.choices01_optionD);

        choice02_optionA = view.findViewById(R.id.choices02_optionA);
        choice02_optionB = view.findViewById(R.id.choices02_optionB);
        choice02_optionC = view.findViewById(R.id.choices02_optionC);
        choice02_optionD = view.findViewById(R.id.choices02_optionD);

        choice03_optionA = view.findViewById(R.id.choices03_optionA);
        choice03_optionB = view.findViewById(R.id.choices03_optionB);
        choice03_optionC = view.findViewById(R.id.choices03_optionC);
        choice03_optionD = view.findViewById(R.id.choices03_optionD);

        choice04_optionA = view.findViewById(R.id.choices04_optionA);
        choice04_optionB = view.findViewById(R.id.choices04_optionB);
        choice04_optionC = view.findViewById(R.id.choices04_optionC);
        choice04_optionD = view.findViewById(R.id.choices04_optionD);

        choice05_optionA = view.findViewById(R.id.choices05_optionA);
        choice05_optionB = view.findViewById(R.id.choices05_optionB);
        choice05_optionC = view.findViewById(R.id.choices05_optionC);
        choice05_optionD = view.findViewById(R.id.choices05_optionD);

        choice06_optionA = view.findViewById(R.id.choices06_optionA);
        choice06_optionB = view.findViewById(R.id.choices06_optionB);

        choice07_optionA = view.findViewById(R.id.choices07_optionA);
        choice07_optionB = view.findViewById(R.id.choices07_optionB);
        choice07_optionC = view.findViewById(R.id.choices07_optionC);

        choice08_optionA = view.findViewById(R.id.choices08_optionA);
        choice08_optionB = view.findViewById(R.id.choices08_optionB);
        choice08_optionC = view.findViewById(R.id.choices08_optionC);
        choice08_optionD = view.findViewById(R.id.choices08_optionD);
        choice08_optionE = view.findViewById(R.id.choices08_optionE);

        choice09_optionA = view.findViewById(R.id.choices09_optionA);
        choice09_optionB = view.findViewById(R.id.choices09_optionB);
        choice09_optionC = view.findViewById(R.id.choices09_optionC);
        choice09_optionD = view.findViewById(R.id.choices09_optionD);

        choice10_optionA = view.findViewById(R.id.choices10_optionA);
        choice10_optionB = view.findViewById(R.id.choices10_optionB);
        choice10_optionC = view.findViewById(R.id.choices10_optionC);
        choice10_optionD = view.findViewById(R.id.choices10_optionD);
    }

//    public void setSurvey() {
//        Question q01 = new Question(getString(R.string.question01));
//        q01.addAnswer("A", new Answer(getString(R.string.q01_choice1), RiskLevel.HIGH_RISK));
//        q01.addAnswer("B", new Answer(getString(R.string.q01_choice2), RiskLevel.MODERATE_RISK));
//        q01.addAnswer("C", new Answer(getString(R.string.q01_choice3), RiskLevel.MODERATE_RISK));
//        q01.addAnswer("D", new Answer(getString(R.string.q01_choice4), RiskLevel.LOW_RISK));
//
//        Question q02 = new Question(getString(R.string.question02));
//        q02.addAnswer("A", new Answer(getString(R.string.q02_choice1), RiskLevel.HIGH_RISK));
//        q02.addAnswer("B", new Answer(getString(R.string.q02_choice2), RiskLevel.LOW_RISK));
//        q02.addAnswer("C", new Answer(getString(R.string.q02_choice3), RiskLevel.MODERATE_RISK));
//        q02.addAnswer("D", new Answer(getString(R.string.q02_choice4), RiskLevel.MODERATE_RISK));
//
//        Question q03 = new Question(getString(R.string.question03));
//        q03.addAnswer("A", new Answer(getString(R.string.q03_choice1), RiskLevel.LOW_RISK));
//        q03.addAnswer("B", new Answer(getString(R.string.q03_choice2), RiskLevel.MODERATE_RISK));
//        q03.addAnswer("C", new Answer(getString(R.string.q03_choice3), RiskLevel.MODERATE_RISK));
//        q03.addAnswer("D", new Answer(getString(R.string.q03_choice4), RiskLevel.HIGH_RISK));
//
//        Question q04 = new Question(getString(R.string.question04));
//        q04.addAnswer("A", new Answer(getString(R.string.q04_choice1), RiskLevel.LOW_RISK));
//        q04.addAnswer("B", new Answer(getString(R.string.q04_choice2), RiskLevel.MODERATE_RISK));
//        q04.addAnswer("C", new Answer(getString(R.string.q04_choice3), RiskLevel.MODERATE_RISK));
//        q04.addAnswer("D", new Answer(getString(R.string.q04_choice4), RiskLevel.HIGH_RISK));
//
//        Question q05 = new Question(getString(R.string.question05));
//        q05.addAnswer("A", new Answer(getString(R.string.q05_choice1), RiskLevel.HIGH_RISK));
//        q05.addAnswer("B", new Answer(getString(R.string.q05_choice2), RiskLevel.HIGH_RISK));
//        q05.addAnswer("C", new Answer(getString(R.string.q05_choice3), RiskLevel.MODERATE_RISK));
//        q05.addAnswer("D", new Answer(getString(R.string.q05_choice4), RiskLevel.LOW_RISK));
//
//        Question q06 = new Question(getString(R.string.question06));
//        q06.addAnswer("A", new Answer(getString(R.string.q06_choice1), RiskLevel.LOW_RISK));
//        q06.addAnswer("B", new Answer(getString(R.string.q06_choice2), RiskLevel.HIGH_RISK));
//
//        Question q07 = new Question(getString(R.string.question07));
//        q07.addAnswer("A", new Answer(getString(R.string.q07_choice1), RiskLevel.HIGH_RISK));
//        q07.addAnswer("B", new Answer(getString(R.string.q07_choice2), RiskLevel.MODERATE_RISK));
//        q07.addAnswer("C", new Answer(getString(R.string.q07_choice3), RiskLevel.LOW_RISK));
//
//        Question q08 = new Question(getString(R.string.question08));
//        q08.addAnswer("A", new Answer(getString(R.string.q08_choice1), RiskLevel.LOW_RISK));
//        q08.addAnswer("B", new Answer(getString(R.string.q08_choice2), RiskLevel.LOW_RISK));
//        q08.addAnswer("C", new Answer(getString(R.string.q08_choice3), RiskLevel.MODERATE_RISK));
//        q08.addAnswer("D", new Answer(getString(R.string.q08_choice4), RiskLevel.MODERATE_RISK));
//        q08.addAnswer("E", new Answer(getString(R.string.q08_choice5), RiskLevel.HIGH_RISK));
//
//        Question q09 = new Question(getString(R.string.question09));
//        q09.addAnswer("A", new Answer(getString(R.string.q09_choice1), RiskLevel.HIGH_RISK));
//        q09.addAnswer("B", new Answer(getString(R.string.q09_choice2), RiskLevel.MODERATE_RISK));
//        q09.addAnswer("C", new Answer(getString(R.string.q09_choice3), RiskLevel.MODERATE_RISK));
//        q09.addAnswer("D", new Answer(getString(R.string.q09_choice4), RiskLevel.LOW_RISK));
//
//        Question q10 = new Question(getString(R.string.question10));
//        q10.addAnswer("A", new Answer(getString(R.string.q10_choice1), RiskLevel.LOW_RISK));
//        q10.addAnswer("B", new Answer(getString(R.string.q10_choice2), RiskLevel.MODERATE_RISK));
//        q10.addAnswer("C", new Answer(getString(R.string.q10_choice3), RiskLevel.MODERATE_RISK));
//        q10.addAnswer("D", new Answer(getString(R.string.q10_choice4), RiskLevel.HIGH_RISK));
//
//        surveyQuestions = new Question[]{
//                q01, q02, q03, q04, q05, q06, q07, q08, q09, q10
//        };
//
//        questionaire(surveyQuestions);
//    }
//
//    public static void questionaire(Question[] surveyQuestions) {
//        for (Question question : surveyQuestions) {
//            question.getAnswer();
//            String userChoice =
//
//        }
//        checkRiskValue(userChoice, question);
//
//
//    if (low > med && low > high){
//        //is low has the highest tally
//
//    } else if (med > low && med > high){
//        //if med has the highest tally
//
//    } else
//        //if high has the highest tally
//
//    }
//
//    private void checkRiskValue(String userChoice, Question question) {
//        RiskLevel riskLevel = question.getAnswer(userChoice).getRiskLevel();
//        switch (riskLevel) {
//            case LOW_RISK:
//                low++;
//                break;
//            case MODERATE_RISK:
//                med++;
//                break;
//            case HIGH_RISK:
//                high++;
//                break;
//        }
//    }
}
