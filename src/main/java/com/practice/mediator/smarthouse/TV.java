package com.practice.mediator.smarthouse;

public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange, name);
    }

    public void startTv() {
        System.out.println("It's time to start TV!");
    }

    public void stopTv() {
        System.out.println("It's time to stop TV!");
    }
}
