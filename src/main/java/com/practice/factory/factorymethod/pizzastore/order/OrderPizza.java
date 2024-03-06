package com.practice.factory.factorymethod.pizzastore.order;


import com.practice.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    // 定義一個抽象方法，createPizza，讓各個工廠子類別自己實作
    abstract Pizza createPizza(String orderType);

    // 建構子
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 訂購 Pizza 的類型
        do {
            orderType = getType();
            pizza = createPizza(orderType); // 抽象方法，由工廠子類別完成
            // 輸出 Pizza 製作過程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while(true);
    }

//    // 定義一個簡單工廠物件
//    private SimpleFactory simpleFactory; // 聚合 Aggregation
//    Pizza pizza = null;
//
//    // 建構子
//    public OrderPizza(SimpleFactory simpleFactory) {
//        setFactory(simpleFactory);
//    }
//
//    public void setFactory(SimpleFactory simpleFactory) {
//        String orderType = ""; // 用戶輸入的
//
//        this.simpleFactory = simpleFactory; // 設置簡單工廠物件
//
//        do {
//            orderType = getType();
//            pizza = this.simpleFactory.createPizza(orderType);
//
//            // 輸出 Pizza
//            if (pizza != null) { // 訂購成功
//                pizza.prepare();
//                pizza.bake();
//                pizza.cut();
//                pizza.box();
//            } else {
//                System.out.println(" 訂購 Pizza 失敗");
//                break;
//            }
//        } while (true);
//    }

    // 寫一個方法，可以獲取客戶希望訂購的 Pizza 種類
    private String getType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input pizza 種類: ");
            String str = strIn.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
