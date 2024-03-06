package com.practice.mediator;


import com.practice.mediator.smarthouse.*;

/**
 * 中介者模式-智能家庭的操作流程
 * 1. 創建 ConcreteMediator 物件
 * 2. 創建各個同事類物件，比如： Alarm, CoffeeMachine, TV...
 * 3. 在創建同事類物件的時候，就直接通過建構子加入到 colleagueMap
 * 4. 同事類物件，可以呼叫 sendMessage，最終去呼叫 ConcreteMediator 的 getMessage()方法
 * 5. getMessage() 會根據接受到的同事物件發出的消息來協調呼叫其他的同事物件完成任務
 * 6. 可以看到 getMessage() 是核心方法，完成相應任務
 */


public class Client {
    public static void main(String[] args) {
        // 創建一個中介者物件
        Mediator mediator = new ConcreteMediator();

        // 創建 Alarm 並加入到 ConcreteMediator 物件的 HashMap
        Alarm alarm = new Alarm(mediator, "alarm");

        // 創建 CoffeeMachine 物件並加入到 ConcreteMediator 物件的 HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
                "coffeeMachine");

        // 創建 Curtains 物件並加入到 ConcreteMediator 物件的 HashMap
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator, "TV");

        // 讓 Alarm 發出消息
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
/**
 * 中介者模式的角色即職責
 *
 * 1. Mediator 就是抽象中介者，定義了同事物件到中介者物件的介面
 * 2. Colleague 是抽象同事類別
 * 3. ConcreteMediator 具體的中介者物件，實作抽象方法，他需要知道所有的具體同事類別，
 *    即以一個集合來管理HashMap，並接受某個物件消息，完成相應任務
 * 4. ConcreteColleague 具體的同事類別，會有很多，每個同事只知道自己的行為，
 *    而不了解其他同事類別的行為，但是他們都依賴中介者物件
 *
 *
 *    ConcreteMediator 具體的中介類別
 *    1. 管理所有的同事類別
 *    2. 完成相應的操作和任務
 */