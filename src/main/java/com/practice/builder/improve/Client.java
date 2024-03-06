package com.practice.builder.improve;

public class Client {

    public static void main(String[] args) {
        // 蓋普通房子
        CommonHouse commonHouse = new CommonHouse();

        // 準備創建房子的指揮者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        System.out.println("輸出流程");
        // 完成蓋房子，回傳產品(房子)
        House house = houseDirector.constructHouse();

        System.out.println("---------------------------------");
        // 蓋高樓
        HighBuilding highBuilding = new HighBuilding();
        // 重製建造者
        houseDirector.setHouseBuilder(highBuilding);
        System.out.println("輸出流程");
        // 完成蓋房子，回傳產品(高樓)
        houseDirector.constructHouse();

    }
}
