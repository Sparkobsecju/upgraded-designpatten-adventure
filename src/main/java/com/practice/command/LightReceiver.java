package com.practice.command;

// 接受者角色，如何實施和執行一個請求相關的操作
public class LightReceiver {

    public void on() {
        System.out.println("電燈打開了.. ");
    }

    public void off() {
        System.out.println("電燈關閉了.. ");
    }
}
