package com.practice.principle.singleresponsibility;

public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽車");
        vehicle2.runWater("輪船");
        vehicle2.runAir("飛機");
    }
}

// 方式3的分析
// 1. 這種修改沒有對原來的類做大修改，只是增加方法
// 2. 這裡雖然沒有在類這個級別上遵守單一職責原則，但是在方法級別上，仍是遵守單一職責
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上運行....");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上運行....");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中運行....");
    }
}