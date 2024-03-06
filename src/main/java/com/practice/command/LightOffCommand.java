package com.practice.command;

public class LightOffCommand implements Command {

    // 聚合 LightReceiver
    LightReceiver light;

    // 建構子
    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 呼叫接受者的方法
        light.off();
    }

    @Override
    public void undo() {
        // 呼叫接受者的方法
        light.on();
    }
}
