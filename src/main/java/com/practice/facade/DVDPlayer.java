package com.practice.facade;

public class DVDPlayer {

    // 使用單例模式，積極
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" dvd on");
    }

    public void off() {
        System.out.println(" dvd off");
    }

    public void play() {
        System.out.println(" dvd is playing");
    }

    public void pause() {
        System.out.println(" dvd pause ..");
    }
}
