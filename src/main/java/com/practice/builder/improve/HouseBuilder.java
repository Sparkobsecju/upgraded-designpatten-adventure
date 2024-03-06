package com.practice.builder.improve;

// 抽象的建造者
public abstract class HouseBuilder {
    protected House house = new House();

    // 將建造的流程寫好
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    // 建造好房子，將產品(房子)回傳
    public  House buildHouse() {
        return house;
    }
}
