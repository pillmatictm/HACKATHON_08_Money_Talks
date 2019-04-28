package org.pursuit.hackathon_8_money_talks.faqRecycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.pursuit.hackathon_8_money_talks.R;

public class FaqViewHolder extends RecyclerView.ViewHolder {

    private TextView faqQuestionsTextView;
    private TextView faqAnswersTextView;

    public FaqViewHolder(@NonNull View itemView) {
        super(itemView);

        faqQuestionsTextView = itemView.findViewById(R.id.faqQuestionsTextView);
        faqAnswersTextView = itemView.findViewById(R.id.faqAnswersTextView);
    }

    public void onBind(String question, String answer) {
        faqQuestionsTextView.setText(question);
        faqAnswersTextView.setText(answer);
    }
}
