package com.example.lab1.model;

public class Question {
    private int mResId;
    private boolean mAnswerTrue;

    public Question(int mResId, boolean manswerTrue) {
        this.mResId = mResId;
        this.mAnswerTrue = manswerTrue;
    }

    public int getResId() {
        return mResId;
    }

    public void setResId(int ResId) {
        mResId = ResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
