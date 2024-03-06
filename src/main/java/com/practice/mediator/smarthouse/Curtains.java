package com.practice.mediator.smarthouse;

public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange, name);
    }

    public void upCurtains() {
        System.out.println("I am holding Up Curtains!");
    }

}
