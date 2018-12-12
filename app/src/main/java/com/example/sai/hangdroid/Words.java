package com.example.sai.hangdroid;

public class Words {
    private String words;
    private int group;

    Words() {

    }
    Words(String worder, int grouper) {
        this.words = worder;
        this.group = grouper;
    }
    public String getWords() {
        return this.words;
    }
    public void setWords(String setter) {
        this.words = setter;
    }
    public int getGroup() {
        return this.group;
    }
    public void setGroup(int setter) {
        this.group = setter;
    }
    public String[] wordArray() {
        String[] array = this.words.split(",");
        return array;
    }
}
