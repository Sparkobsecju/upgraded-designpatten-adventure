package com.practice.command;

public class TVOffCommand implements Command {
    // 聚合 TVReceiver
    TVReceiver tv;

    // 建構子
    public TVOffCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 呼叫接受者的方法
        tv.off();
    }

    @Override
    public void undo() {
        // 呼叫接受者的方法
        tv.on();
    }
}
