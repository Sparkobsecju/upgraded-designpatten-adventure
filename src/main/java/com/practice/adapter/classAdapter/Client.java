package com.practice.adapter.classAdapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("==== 類別配接器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
