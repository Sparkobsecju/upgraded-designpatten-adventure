package com.practice.command;

// 將一個接收者物件與一個命令綁定，呼叫接受者興應的操作，實現execute()
public class LightOnCommand implements Command {

    // 聚合 LightReceiver
    private LightReceiver light;


    // 建構子
    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 呼叫接受者的方法
        light.on();
    }
    @Override
    public void undo() {
        // 呼叫接受者的方法
        light.off();
    }
}
