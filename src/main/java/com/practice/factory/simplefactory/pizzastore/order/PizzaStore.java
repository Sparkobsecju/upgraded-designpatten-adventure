package com.practice.factory.simplefactory.pizzastore.order;

// 相當於一個客戶端，發出訂購
public class PizzaStore {

    public static void main(String[] args) {
        // new OrderPizza();

        // 使用簡單工廠模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("~~~退出應用程式~~~");

        // 靜態
        new OrderPizza2(); // 初始化時處理 new SimpleFactory()
    }
}
