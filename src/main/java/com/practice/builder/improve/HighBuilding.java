package com.practice.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 高樓打地基100公尺");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高樓砌牆20cm");
    }

    @Override
    public void roofed() {
        System.out.println(" 高樓封閉透明屋頂");
    }

}
