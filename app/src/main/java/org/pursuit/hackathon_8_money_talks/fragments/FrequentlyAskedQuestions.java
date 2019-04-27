package org.pursuit.hackathon_8_money_talks.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.hackathon_8_money_talks.R;
import org.pursuit.hackathon_8_money_talks.faqRecycler.FaqAdapter;

import java.util.ArrayList;
import java.util.List;

public class FrequentlyAskedQuestions extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    List<String> faqQuestions = new ArrayList<>();
    List<String> faqAnswers = new ArrayList<>();

    RecyclerView recyclerView;
    FaqAdapter faqAdapter;


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

        faqQuestions.add("1. Why should I invest in stocks?");
        faqQuestions.add("2. How do I know what kinds of stocks to invest in?");
        faqQuestions.add("3. What’s the benefit of investing in funds over individual stocks and bonds?");
        faqQuestions.add("4. Why is it important to invest in both stocks and bonds?");
        faqQuestions.add("5. Why are bonds considered safer than stocks?");
        faqQuestions.add("6. Why do stock prices go up and down so much?");
        faqQuestions.add("7. How long should I hold onto a stock?");
        faqQuestions.add("8. How long should I hold onto a bond?");
        faqQuestions.add("9. How can I tell what’s a normal market fluctuation and what’s not?");
        faqQuestions.add("10. What should I do when the market drops a lot in a short period?");
        faqQuestions.add("11. How many bear and bull markets have there been?");
        faqQuestions.add("12. What other investments besides stocks and bonds can I consider?");
        faqQuestions.add("13. Why can’t I invest in a private company?");
        faqQuestions.add("14. How many different investment accounts should I have?");


        faqAnswers.add("They provide an opportunity to grow your money over time. While there are risks—stocks can go up and down, and companies can go bankrupt—there’s also the opportunity for larger returns than you might get by putting all your money in a savings account (or under your mattress). Investing can also provide income outside of your paycheck through dividends.");
        faqAnswers.add("It depends on what you need your investments to do for you, and what holes you need to fill in your portfolio. If you’re looking for rapid growth and can handle a lot of risk, you might look to new tech companies, for example. If you want a safer bet, blue-chip stocks might be for you. To diversify your portfolio, it’s wise to invest in a range of different stocks and sectors. \n When deciding whether to buy shares of a company, you may want to consider its earnings history and projections and the current stock price relative to its 52-week high and low. You can also read analysts’ reports and ratings. \n Of course, investing in individual stocks isn’t the only option. You can invest in baskets of stocks through index, exchange-traded or mutual funds.");
        faqAnswers.add("If you invest all your money in one stock, and it goes down, you can lose a lot of money (assuming it doesn’t go back up before you need to sell). But if you invest in a mutual fund or ETF, you can own hundreds of different stocks and bonds, allowing you broad diversification with just one investment.");
        faqAnswers.add("Owning both stocks and bonds is how many investors diversify their portfolios, as stocks tend to be a riskier investment, while bonds are generally considered safer. For that reason, as you get older—and closer to retirement age—experts recommend shifting your asset allocation toward owning more bonds. \n One rule of thumb to simplify asset allocation is the Rule of 100, in which you subtract your age from 100 in order to figure out what percentage of your portfolio should be stocks. For example, a 30 year old would aim for 70 percent stocks, 30 percent bonds, while a 60 year old’s portfolio would be made up of 40 percent stocks and 60 percent bonds.");
        faqAnswers.add("Bonds are essentially loans you give an issuer (typically a company or a government agency) with the expectation that you’ll get paid back, with interest, over a specific timeframe. While there’s always the risk that the issuer will encounter financial troubles and be unable to make good on the plan, this isn’t a common occurrence—making bonds a relatively safe investment. \n That’s compared to stocks, which are investments in a public company. Your shares go up and down with the company’s value, which can be affected by a wide array of (often unpredictable) factors, including management decisions, government regulations and macroeconomic events.");
        faqAnswers.add("Ups and downs are completely normal. A lot of factors can influence fluctuations—from movements in oil prices or unemployment numbers to the presidential election. If your plan is to invest for the long term, you are bound to experience some day-to-day volatility along the way. But, historically, the stock market has recovered from downturns, and continued to climb, over time.");
        faqAnswers.add("Generally, you should only invest in stocks or stock funds with money that you won’t need for at least a few years, as the market fluctuates and you don’t want to be forced to sell a stock that’s down because you need the money. Investors often have mid- to long-term goals in mind, like saving up for a down payment on a house you plan to buy down the road, or for retirement. \n If you’re concerned about a particular investment that’s losing value, go back to square one and think about why you chose it in the first place and what’s changed since. For example, if the company or fund has experienced big management or strategy changes, you might reconsider its place in your portfolio. On the other hand, if nothing much has changed about the company, the price fell in step with the market at large or the sector it’s in, and you believe in the company’s future and projected earnings, it could be worth hanging onto—and, perhaps, buying more shares in—as the market has historically recovered from downturns over time.");
        faqAnswers.add("Typically, you’d hold a bold to maturity (or when the original amount loaned becomes due) to reap the full benefit of a payback, but you can sell early on the secondary market via a broker. Just understand that you may wind up with more or less than what you paid originally, as the value of the bond may shift on this market. If interest rates rise, the bond’s value may drop—and vice versa. And you may be charged a commission by the broker.\n");
        faqAnswers.add("Comparing stock performance to an appropriate benchmark is a good way to gauge how it’s doing. For example, on a day when Standard & Poor’s 500-stock index drops, a drop in the price of a large-company stock you own can be expected. \n On the other hand, if your stock falls 5 to 10 percent more than its benchmark, you might want to take a closer look at what’s going on with the company and reassess its place in your portfolio. Remember, though, that many individual stocks can experience dips and then rebound. So it’s important to look at what’s triggering the drop in a particular stock’s value, and how it’s performed over the long run, when deciding how to proceed.");
        faqAnswers.add("Don’t panic. A well-diversified portfolio is designed to grow over the long term—and offer some protection against market fluctuations. Keep your longer term goals in mind, and don’t let your emotions drive your decisions!");
        faqAnswers.add("The market has cycled between bull markets—or when the market increases 20 percent or more in value—and bear markets—when the market decreases by 20 percent or more—many times in history. From 1926 to 2014, according to an analysis by First Trust Portfolios, there have been eight bear markets, lasting an average of 1.3 years and averaging a cumulative loss of 41 percent. Alternatively, there have been nine bull markets, lasting an average of 8.5 years and returning an average of 458 percent.");
        faqAnswers.add("For your short-terms savings, consider certificates of deposit and money market accounts. Both typically offer higher interest rates than the average savings accounts and still keep your money secure, though with CDs your money will be tied up for a certain period of time. \n Other long-term investments you might consider include real estate and commodities. You can invest in a fund focused on real estate, precious metals, energy or some other sector. Another possibility is investing in a real estate investment trust (REIT), which is like a mutual fund that invests in income-producing real estate. These kinds of alternative investments are generally considered riskier bets, so you may want to limit these holdings to a small slice of your portfolio.");
        faqAnswers.add("Technically, you can, but it can be risky, difficult to get into (and out of) and is typically reserved for the wealthy. Recent rule changes from the U.S. Securities and Exchange Commission (SEC) have made it a little easier to invest in private small businesses using online platforms such as SeedInvest and Wefunder. \n You used to have to be an “accredited investor” (with a net worth of at least $1 million or an annual income of at least $200,000 for the last two years) in order to participate in this kind of investing. Now, if your net worth or earnings are less than $100,000 a year, you can invest up to the greater of $2,000 or 5 percent of your annual income or net worth (whichever is less) into a small business. Those with an annual income and net worth of more than $100,000 can invest up to 10 percent of their annual income or net worth, whichever is lower.");
        faqAnswers.add("It depends on your own unique situation. Typically, you should have a checking account for your regular spending, a savings account for your near-term goals (and your emergency fund), and investment accounts for your mid- to long-term goals. \n If you have kids, you might have a 529 plan for each of your kids’ college funds. You may also have multiple investment accounts, including an employer-sponsored retirement plan like a 401(k) and an Individual Retirement Account (or IRA), plus a taxable brokerage account (offered by companies like Acorns).");

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler_view);
        setRecyclerView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_frequently_asked_questions, container, false);
    }

    private void setRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        faqAdapter = new FaqAdapter(faqQuestions, faqAnswers);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(faqAdapter);
    }

}
