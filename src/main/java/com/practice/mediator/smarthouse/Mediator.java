package com.practice.mediator.smarthouse;

public interface Mediator {
    // 接收消息，具體的同事物件發出
    public abstract void getMessage(int stateChange, String colleague);
    // 將中介者物件，加入到集合中
    public abstract void register(String colleagueName, Colleague colleague);
    public abstract void sendMessage();
}
