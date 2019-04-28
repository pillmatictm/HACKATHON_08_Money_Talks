package org.pursuit.hackathon_8_money_talks.survey;

import java.util.HashMap;
import java.util.Map;

public class Question {
    private Map<String, Answer> riskHashMap = new HashMap<>();
    private String promptQuestion;
    private String selectedUserAnswer;

    public Question(String promptQuestion) {
        this.promptQuestion = promptQuestion;
    }

    public String getPromptQuestion() {
        return promptQuestion;
    }

    public Answer getAnswer(String key){
        return riskHashMap.get(key);
    }

    public void addAnswer(String key, Answer answer){
        this.riskHashMap.put(key,answer);
    }

    public Answer getSelectedUserAnswer(){
        return riskHashMap.get(selectedUserAnswer);
    }

    public void setSelectedUserAnswer(String selectedUserAnswer) {
        this.selectedUserAnswer = selectedUserAnswer;
    }
}
