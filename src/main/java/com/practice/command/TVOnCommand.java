package com.practice.command;

public class TVOnCommand implements Command {
    // 聚合 TVReceiver
    TVReceiver tv;

    // 建構子
    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 呼叫接受者的方法
        tv.on();
    }

    @Override
    public void undo() {
        // 呼叫接受者的方法
        tv.off();
    }
}
