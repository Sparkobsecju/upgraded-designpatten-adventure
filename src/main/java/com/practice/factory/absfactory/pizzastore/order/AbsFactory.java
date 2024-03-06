package com.practice.factory.absfactory.pizzastore.order;

import com.practice.factory.absfactory.pizzastore.pizza.Pizza;

// 一個抽象工廠模式的抽象層 (介面)
public interface AbsFactory {
    // 讓下面的工廠子類別來 具體實作
    public Pizza createPizza(String orderType);
}
