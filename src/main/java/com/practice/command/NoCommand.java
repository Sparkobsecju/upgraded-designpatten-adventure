package com.practice.command;

/**
 * 沒有任何命令，即空執行：用於初始化每個按鈕，當呼叫空命令時，
 * 物件甚麼都不做，這也是一種設計模式，可以省掉對空的判斷
 *
 */
// NoCommand 表示空命令，對於簡化操作有幫助，可以省去對空的判斷
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
