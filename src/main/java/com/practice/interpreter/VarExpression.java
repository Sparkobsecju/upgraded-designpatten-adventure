package com.practice.interpreter;

import java.util.HashMap;

/**
 * 變數的解釋器
 *
 */
public class VarExpression extends Expression {

    private String key; // key 就是公式 (表達式) 參數 [a, b, c]

    public VarExpression(String key) {
        this.key = key;
    }

    // var 就是 {a=10, b=20}
    // interpreter 根據變數的値返回對應的値
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
