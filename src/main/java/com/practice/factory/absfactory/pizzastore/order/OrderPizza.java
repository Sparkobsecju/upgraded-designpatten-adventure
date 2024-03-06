package com.practice.factory.absfactory.pizzastore.order;

import com.practice.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    private AbsFactory factory;

    // 建構子
    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = ""; // 用戶輸入
        this.factory = factory;

        do {
            orderType = getType();
            // factory 可能是北京的工廠子類別，也可能是倫敦的工廠子類別
            pizza = factory.createPizza(orderType);
            if (pizza != null) { // 訂購 OK
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("訂購失敗");
                break;
            }

        } while (true);
    }

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
