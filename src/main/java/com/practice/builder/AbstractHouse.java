package com.practice.builder;

public abstract class AbstractHouse {
    // 打地基
    public abstract void buildBasic();
    // 砌牆
    public abstract void buildWalls();
    // 封頂
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
