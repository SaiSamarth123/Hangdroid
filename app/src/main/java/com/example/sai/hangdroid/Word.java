package com.example.sai.hangdroid;

public class Word {
    private String word;
    private int length;
    Word(String worder, int lengther) {
        this.word = worder;
        this.length = lengther;
    }
    public String getWord() {
        return this.word;
    }
    public int getLength() {
        return this.length;
    }

}
