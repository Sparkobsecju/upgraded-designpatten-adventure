package com.practice.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基5公尺");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌牆10cm");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子封閉屋頂");
    }
}
