package com.practice.mediator.smarthouse;

public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange, name);
    }

    public void startCoffee() {
        System.out.println("It's time to start coffee!");
    }

    public void finishCoffee() {

        System.out.println("After 5 minutes!");
        System.out.println("Coffee's done!");
        sendMessage(0);
    }
    public void stopCoffee() {
        System.out.println("It's time to stop coffee!");

    }
}
