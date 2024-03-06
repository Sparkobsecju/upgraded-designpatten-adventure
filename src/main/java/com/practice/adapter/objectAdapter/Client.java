package com.practice.adapter.objectAdapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("==== 物件配接器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
