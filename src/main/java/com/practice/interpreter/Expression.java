package com.practice.interpreter;

import java.util.HashMap;

/**
 * 抽象類別表達式，通過 HashMap 鍵値對，可以獲取到變數的値
 *
 */
public abstract class Expression {
    // a + b - c
    // 解釋公式和數值，key 就是公式 (表達式) 參數 [a, b, c], value 就是具體的參數值
    // HashMap {a=10, b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
