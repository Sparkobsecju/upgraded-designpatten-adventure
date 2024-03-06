package com.practice.template.improve;

public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        // 空實作
    }

    @Override
    boolean doesWantCondiments() {
        return false;
    }
}
