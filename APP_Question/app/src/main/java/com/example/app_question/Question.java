package com.example.app_question;

import java.util.List;

public class Question {
    private int socauhoi;
    private String content;
    private List<Answer> listAnswer;

    public Question(int socauhoi, String content, List<Answer> listAnswer) {
        this.socauhoi = socauhoi;
        this.content = content;
        this.listAnswer = listAnswer;
    }

    public int getSocauhoi() {
        return socauhoi;
    }

    public void setSocauhoi(int socauhoi) {
        this.socauhoi = socauhoi;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Answer> getListAnswer() {
        return listAnswer;
    }

    public void setListAnswer(List<Answer> listAnswer) {
        this.listAnswer = listAnswer;
    }
}
