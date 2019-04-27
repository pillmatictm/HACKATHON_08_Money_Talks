package org.pursuit.hackathon_8_money_talks.faqRecycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.hackathon_8_money_talks.R;

import java.util.List;

public class FaqAdapter extends RecyclerView.Adapter<FaqViewHolder> {

    private List<String> faqQuestionsList;

    public FaqAdapter(List<String> faqQuestionsList) {
        this.faqQuestionsList = faqQuestionsList;
    }

    @NonNull
    @Override
    public FaqViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View childview = LayoutInflater.from(parent.getContext()).inflate(R.layout.faq_itemview, parent, false);
        return new FaqViewHolder(childview);
    }

    @Override
    public void onBindViewHolder(@NonNull FaqViewHolder faqViewHolder, int position) {
        faqViewHolder.onBind(faqQuestionsList.get(position));
    }

    @Override
    public int getItemCount() {
        return faqQuestionsList.size();
    }
}
