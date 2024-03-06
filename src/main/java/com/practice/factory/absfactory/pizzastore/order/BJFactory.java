package com.practice.factory.absfactory.pizzastore.order;

import com.practice.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.practice.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.practice.factory.absfactory.pizzastore.pizza.Pizza;

// 這是一個工廠 子類別
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工廠模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
