package com.practice.template;

public class Client {
    public static void main(String[] args) {
        // 製作紅豆豆漿
        System.out.println("----製作紅豆豆漿----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----製作花生豆漿----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
