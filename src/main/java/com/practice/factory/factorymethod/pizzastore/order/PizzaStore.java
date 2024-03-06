package com.practice.factory.factorymethod.pizzastore.order;

public class PizzaStore {

    public static void main(String[] args) {
        String location = "bj";
        if (location.equals("bj")) {
            // 創建北京口味的各種 Pizza
            new BJOrderPizza();
        } else {
            // 創建倫敦口味的各種 Pizza
            new LDOrderPizza();
        }
    }
}
