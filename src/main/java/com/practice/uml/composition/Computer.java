package com.practice.uml.composition;

public class Computer {
    private Mouse mouse = new Mouse(); // 滑鼠可以和Computer不能分離
    private Monitor monitor = new Monitor(); // 螢幕可以和Computer不能分離

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
