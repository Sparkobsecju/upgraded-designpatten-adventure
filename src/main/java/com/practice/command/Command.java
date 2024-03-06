package com.practice.command;

// 命令角色，需要執行的所有命令都在這裡，可以是介面或是抽象類別
public interface Command {

    // 執行動作(操作)
    public void execute();
    // 撤銷動作(操作)
    public void undo();
}
