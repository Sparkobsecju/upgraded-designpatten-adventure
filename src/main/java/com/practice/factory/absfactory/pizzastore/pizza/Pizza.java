package com.practice.factory.absfactory.pizzastore.pizza;

// 將 Pizza，
public abstract class Pizza {

    protected String name; // 名字

    // 準備原材料，不同的 Pizza 不一樣，因此，我們做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    // 打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }
}
