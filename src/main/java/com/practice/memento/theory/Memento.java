package com.practice.memento.theory;

public class Memento {
    private String state;

    // 建構子
    public Memento(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

}
