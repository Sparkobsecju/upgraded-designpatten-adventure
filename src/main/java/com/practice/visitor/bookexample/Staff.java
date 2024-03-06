package com.practice.visitor.bookexample;

import java.util.Random;

public abstract class Staff {
    private String name;
    private int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }
    public abstract void accept(Visitor visitor);
//    public void accept(Visitor visitor) {
//        visitor.visit(this); // 抽象類別或介面不能用this關鍵字，所以訪問者模式的方法要延後至各個具體Entity中實作
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKpi() {
        return kpi;
    }

    public void setKpi(int kpi) {
        this.kpi = kpi;
    }
}
