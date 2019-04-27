package org.pursuit.hackathon_8_money_talks.faqRecycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.pursuit.hackathon_8_money_talks.R;

import java.util.List;

public class FaqViewHolder extends RecyclerView.ViewHolder {

    private TextView faqQuestionsTextView;
    List<String> faqQuestionsList;

    public FaqViewHolder(@NonNull View itemView, List<String> faqQuestionsList) {
        super(itemView);

        this.faqQuestionsList = faqQuestionsList;

        faqQuestionsTextView = itemView.findViewById(R.id.faqQuestionsTextView);
    }

    public void onBind(String s) {
        faqQuestionsTextView.setText(s);
    }
}
