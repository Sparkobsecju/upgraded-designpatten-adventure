package com.practice.interpreter;


import java.util.HashMap;

/**
 * 加法運算式解釋器
 *
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 處理相加
    // var 仍然是 {a=10, b=20}..
    public int interpreter(HashMap<String, Integer> var) {
        // super.left.interpreter(var) 返回 left 表達式的值 [a=10]
        // super.right.interpreter(var) 返回 right 表達式的值 [b=20]
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
