package com.practice.facade;

public class Client {

    public static void main(String[] args) {
        // 這裡直接呼叫.. 很麻煩
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println("-----");
        homeTheaterFacade.play();
        System.out.println("-----");
        homeTheaterFacade.end();

    }
}
