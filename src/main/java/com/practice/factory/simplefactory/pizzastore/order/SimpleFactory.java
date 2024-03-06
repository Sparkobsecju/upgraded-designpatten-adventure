package com.practice.factory.simplefactory.pizzastore.order;

import com.practice.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.practice.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.practice.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.practice.factory.simplefactory.pizzastore.pizza.Pizza;

// 簡單工廠
public class SimpleFactory {

    // 根據 orderType 回傳對應的 Pizza 物件
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用簡單工廠模式");
        if (orderType.equals("Greek")) {
            pizza = new GreekPizza();
            pizza.setName("希臘 Pizza");
        } else if (orderType.equals("Cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪 Pizza");
        } else if (orderType.equals("Pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒 Pizza");
        }

        return pizza;
    }

    // 簡單工廠模式 也稱為 靜態工廠模式
    public static Pizza createPizza2(String orderType) {

        Pizza pizza = null;

        System.out.println("使用簡單工廠模式");
        if (orderType.equals("Greek")) {
            pizza = new GreekPizza();
            pizza.setName("希臘 Pizza");
        } else if (orderType.equals("Cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪 Pizza");
        } else if (orderType.equals("Pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒 Pizza");
        }

        return pizza;
    }
}
