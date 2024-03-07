package com.practice.memento.theory;

public class Originator {
    private String state; // 狀態訊息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 編寫一個方法，可以保存一個物件 Memento
    // 因此編寫一個方法，回傳 Memento
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    // 通過備忘錄物件，恢復狀態
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
