package com.practice.adapter.classAdapter;

// 被配接的類別
public class Voltage220V {
    // 輸出 220V 的電壓
    public int output220V() {
        int src = 220;
        System.out.println("被配接類別：電壓 = " + src + " V");
        return src;
    }
}
