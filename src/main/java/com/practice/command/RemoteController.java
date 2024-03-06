package com.practice.command;

// 呼叫者角色
public class RemoteController {
    // 開按鈕的命令陣列
    Command[] onCommands;
    Command[] offCommands;

    // 執行撤銷的命令
    Command undoCommand;

    // 建構子，完成對按鈕的初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 給我們按鈕設置你需要的命令
    public void setCommand(int number, Command onCommand, Command offCommand) {
        onCommands[number] = onCommand;
        offCommands[number] = offCommand;
    }

    // 按下開按鈕
    public void onButtonPushed(int number) { // number 0
        // 找到你按下的 開 的按鈕，並呼叫對應方法
        onCommands[number].execute();
        // 紀錄這次的操作，用於撤銷
        undoCommand = onCommands[number];
    }

    // 按下關按鈕
    public void offButtonPushed(int number) { // number 0
        // 找到你按下的 關 的按鈕，並呼叫對應方法
        offCommands[number].execute();
        // 紀錄這次操作，用於撤銷
        undoCommand = offCommands[number];
    }

    // 按下撤銷按鈕
    public void undoButtonPushed() {
        undoCommand.undo();
    }

}
