package com.practice.adapter.classAdapter;

// 配接器
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        // 獲取到 220V 電壓
        int srcV = output220V();
        int dstV = srcV / 44;   // 轉成 5V
        return dstV;
    }
}
