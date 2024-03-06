package com.practice.visitor;

public abstract class Action {
    // 得到男性的評價
    public abstract void getManResult(Man man);

    // 得到女性的評價
    public abstract void getWomanResult(Woman woman);
}
