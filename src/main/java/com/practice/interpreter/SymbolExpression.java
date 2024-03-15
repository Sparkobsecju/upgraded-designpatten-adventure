package com.practice.interpreter;

import java.util.HashMap;

/**
 * 抽象運算符號解釋器，這裡，每個運算符號，都只和自己左右兩個運算元有關係
 * 但左右兩個數字有可能也是一個解析的結果，無論何種形式，都是 Expression 類的實現類
 *
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // 因為 SymbolExpression 是讓其子類別來實現，因此 interpreter 是一個預設實作
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }

}
