package com.practice.uml.aggregation;

public class Computer {
    private Mouse mouse; // 滑鼠可以和Computer分離
    private Monitor monitor; // 螢幕可以和Computer分離

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
