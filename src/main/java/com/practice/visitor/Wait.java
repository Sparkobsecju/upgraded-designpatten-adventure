package com.practice.visitor;

public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人給得評價是觀望中..");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人給得評價是觀望中..");
    }
}
