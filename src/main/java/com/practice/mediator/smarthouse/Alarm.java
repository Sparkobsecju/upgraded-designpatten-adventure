package com.practice.mediator.smarthouse;

// 具體的同事類別
public class Alarm extends Colleague {

    // 建構子
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        // 在創建 Alarm 同事物件時，將自己放入到 ConcreteMediator 物件中[集合]
        mediator.register(name, this);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        // 呼叫中介者物件的 getMessage()
        getMediator().getMessage(stateChange, name);
    }
}
