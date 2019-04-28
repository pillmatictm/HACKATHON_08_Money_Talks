package org.pursuit.hackathon_8_money_talks.survey;

public class Answer {
    RiskLevel riskLevel;
    String answerString;

    public Answer(String answerString, RiskLevel riskLevel) {
        this.answerString = answerString;
        this.riskLevel = riskLevel;
    }

    public RiskLevel getRiskLevel(){
        return riskLevel;
    }
}
