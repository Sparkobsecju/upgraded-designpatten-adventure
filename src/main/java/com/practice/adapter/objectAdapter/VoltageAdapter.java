package com.practice.adapter.objectAdapter;

// 配接器
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V; // 關聯關係 - 聚合

    // 通過建構子，傳入一個 Voltage220V 實例
    public VoltageAdapter(Voltage220V voltage220V) {
        super();
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V(); // 獲取 220V 電壓
            System.out.println("---使用物件配置器，進行配置---");
            dst = src / 44;
            System.out.println("配置完成，輸出的電壓為 = " + dst + " V");
        }
        return dst;
    }
}
