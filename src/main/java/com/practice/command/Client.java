package com.practice.command;

public class Client {
    public static void main(String[] args) {
        // 使用命令設計模式，完成通過遙控器，對電燈的操作

        // 創建電燈的物件(接受者)
        LightReceiver lightReceiver = new LightReceiver();

        // 創建電燈相關的開關命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 需要一個遙控器
        RemoteController remoteController = new RemoteController();

        // 給我們的遙控器設置命令，比如 number = 0 是電燈的開和關的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("--------------按下燈的開按鈕--------------");
        remoteController.onButtonPushed(0);
        System.out.println("--------------按下燈的關按鈕--------------");
        remoteController.offButtonPushed(0);
        System.out.println("--------------按下了撤銷按鈕--------------");
        remoteController.undoButtonPushed();

        System.out.println("===========使用遙控器操作電視機===========");
        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        // 給我們的遙控器設置命令，比如 number = 1 是電視的開和關的操作
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("--------------按下電視的開按鈕--------------");
        remoteController.onButtonPushed(1);
        System.out.println("--------------按下電視的關按鈕--------------");
        remoteController.offButtonPushed(1);
        System.out.println("--------------按下了撤銷按鈕--------------");
        remoteController.undoButtonPushed();
    }
}
