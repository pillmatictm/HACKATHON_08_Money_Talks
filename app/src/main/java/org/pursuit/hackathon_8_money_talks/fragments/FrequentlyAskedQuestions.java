package org.pursuit.hackathon_8_money_talks.fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.pursuit.hackathon_8_money_talks.R;
import org.pursuit.hackathon_8_money_talks.faqRecycler.FaqAdapter;

import java.util.ArrayList;
import java.util.List;

public class FrequentlyAskedQuestions extends Fragment {

    private List<String> faqQuestions = new ArrayList<>();
    private List<String> faqAnswers = new ArrayList<>();

    private RecyclerView recyclerView;


    public FrequentlyAskedQuestions() {
    }

    public static FrequentlyAskedQuestions newInstance() {
        FrequentlyAskedQuestions fragment = new FrequentlyAskedQuestions();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        faqQuestions.add("1. " + getString(R.string.faq_Question1));
        faqQuestions.add("2. " + getString(R.string.faq_Question2));
        faqQuestions.add("3. " + getString(R.string.faq_Question3));
        faqQuestions.add("4. " + getString(R.string.faq_Question4));
        faqQuestions.add("5. " + getString(R.string.faq_Question5));
        faqQuestions.add("6. " + getString(R.string.faq_Question6));
        faqQuestions.add("7. " + getString(R.string.faq_Question7));
        faqQuestions.add("8. " + getString(R.string.faq_Question8));
        faqQuestions.add("9. " + getString(R.string.faq_Question9));
        faqQuestions.add("10. " + getString(R.string.faq_Question10));
        faqQuestions.add("11. " + getString(R.string.faq_Question11));
        faqQuestions.add("12. " + getString(R.string.faq_Question12));
        faqQuestions.add("13. " + getString(R.string.faq_Question13));
        faqQuestions.add("14. " + getString(R.string.faq_Question14));


        faqAnswers.add(getString(R.string.faq_Answer1));
        faqAnswers.add(getString(R.string.faq_Answer2));
        faqAnswers.add(getString(R.string.faq_Answer3));
        faqAnswers.add(getString(R.string.faq_Answer4));
        faqAnswers.add(getString(R.string.faq_Answer5));
        faqAnswers.add(getString(R.string.faq_Answer6));
        faqAnswers.add(getString(R.string.faq_Answer7));
        faqAnswers.add(getString(R.string.faq_Answer8));
        faqAnswers.add(getString(R.string.faq_Answer9));
        faqAnswers.add(getString(R.string.faq_Answer10));
        faqAnswers.add(getString(R.string.faq_Answer11));
        faqAnswers.add(getString(R.string.faq_Answer12));
        faqAnswers.add(getString(R.string.faq_Answer13));
        faqAnswers.add(getString(R.string.faq_Answer14));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_frequently_asked_questions, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler_view);

        setRecyclerView();

        resourceLinksOnClickListener(view);
    }

    private void resourceLinksOnClickListener(@NonNull View view) {

        TextView nerdwallet = view.findViewById(R.id.nerdwallet);
        nerdwallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(getString(R.string.nerdwalletLink));
                Intent nerdwalletIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(nerdwalletIntent);
            }
        });

        TextView investopedia = view.findViewById(R.id.investopedia);
        investopedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(getString(R.string.investopediLink));
                Intent investopediIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(investopediIntent);
            }
        });

        TextView babypips = view.findViewById(R.id.babypips);
        babypips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(getString(R.string.babypipsLink));
                Intent babypipsIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(babypipsIntent);
            }
        });

        TextView thebalance = view.findViewById(R.id.thebalance);
        thebalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(getString(R.string.thebalanceLink));
                Intent theBalanceIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(theBalanceIntent);
            }
        });
    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        FaqAdapter faqAdapter = new FaqAdapter(faqQuestions, faqAnswers);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(faqAdapter);
    }

}
