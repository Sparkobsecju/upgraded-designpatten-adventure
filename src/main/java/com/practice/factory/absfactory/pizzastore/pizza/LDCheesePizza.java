package com.practice.factory.absfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("倫敦的奶酪pizza");
        System.out.println("倫敦的奶酪pizza，準備原材料");
    }
}
