package com.practice.adapter.objectAdapter;

public class Phone {
    // 充電
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("充電電壓為 5V，可以充電~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("充電電壓大於 5V，不能充電~~");
        }
    }
}
