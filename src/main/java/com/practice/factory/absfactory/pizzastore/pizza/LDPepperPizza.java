package com.practice.factory.absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("倫敦的胡椒pizza");
        System.out.println("倫敦的胡椒pizza，準備原材料");
    }
}
