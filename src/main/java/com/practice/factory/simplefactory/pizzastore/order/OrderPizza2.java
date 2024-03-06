package com.practice.factory.simplefactory.pizzastore.order;

import com.practice.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";

    // 建構子
    public OrderPizza2() {
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);

            // 輸出 Pizza
            if (pizza != null) { // 訂購成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 訂購 Pizza 失敗");
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
