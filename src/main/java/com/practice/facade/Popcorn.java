package com.practice.facade;

public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" popcoen on ");
    }

    public void off() {
        System.out.println(" popcoen off");
    }

    public void pop() {
        System.out.println(" popcoen is poping ");
    }
}
