package com.practice.visitor;

// 說明
// 1. 這裡我們使用到了雙分派，即首先再客戶端程式中，將具體狀態作為參數傳遞給Woman中(第一次分派)
// 2. 然後 Woman 類別呼叫作為參數的 "具體方法" 中方法 getWomanResult，同時將自己(this)作為參數
//    傳入，完成第二次分派
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
