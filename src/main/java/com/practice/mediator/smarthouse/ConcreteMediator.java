package com.practice.mediator.smarthouse;

import java.util.HashMap;

// 具體的中介者物件類別
public class ConcreteMediator implements Mediator {
    // 集合，放入所有的同事物件
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;
    public ConcreteMediator() {
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    // 具體中介者核心方法
    // 1. 根據得到的消息，完成對應任務
    // 2. 中介者在這個方法，協調各個具體的同事物件，完成任務
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if(colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine)(colleagueMap.get(interMap.get("CoffeeMachine"))))
                        .startCoffee();
                ((TV)(colleagueMap.get(interMap.get("TV")))).startTv();
            } else if (stateChange == 1) {
                ((TV)(colleagueMap.get(interMap.get("TV")))).stopTv();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains)(colleagueMap.get(interMap.get("Curtains"))))
                    .upCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            // 如果TV發出消息，在這裡處理

        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            // 如果是以窗簾發出的消息，在這裡處理
        }
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm)
            interMap.put("Alarm", colleagueName);
        else if (colleague instanceof CoffeeMachine)
            interMap.put("CoffeeMachine", colleagueName);
        else if (colleague instanceof TV)
            interMap.put("TV", colleagueName);
        else if (colleague instanceof Curtains)
            interMap.put("Curtains", colleagueName);
    }

    @Override
    public void sendMessage() {

    }
}
