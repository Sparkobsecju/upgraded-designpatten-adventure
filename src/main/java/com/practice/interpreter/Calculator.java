package com.practice.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

    // 定義表達式
    private Expression expression;

    // 建構子傳入參數，並解析
    public Calculator(String expStr) { // expStr = a+b-c
        // 安排運算先後順序
        Stack<Expression> stack = new Stack<>();
        // 表達式拆分成字元陣列
        char[] charArray = expStr.toCharArray(); // [a, +, b]

        Expression left = null;
        Expression right = null;
        // 遍歷我們的字元陣列，即遍歷表達式 [a, +, b]
        // 針對不同的情況，做處理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
            case '+': // 加法
                left = stack.pop(); // 從 stack 取出 left => "a"
                right = new VarExpression(String.valueOf(charArray[++i])); // 取出右邊的表達式 "b"
                stack.push(new AddExpression(left, right)); // 然後根據得到 left 和 right 構建 AddExpression 加入 stack
                break;
            case '-': // 減法
                left = stack.pop();
                right = new VarExpression(String.valueOf(charArray[++i]));
                stack.push(new SubExpression(left, right));
                break;
            default: // 公式中的變數
                // 如果是一個 Var 就創建要給 VarExpression 物件，並 push 到 stack
                stack.push(new VarExpression(String.valueOf(charArray[i])));
                break;
            }
        }
        // 當遍歷完整個 charArray 陣列後，stack 中就得到最後的 Expression
        this.expression = stack.pop(); // 得到最後的表達式
    }

    public int run(HashMap<String, Integer> var) {
        // 最後將表達式 a+b 和 var = {a=10, b=20}
        // 然後傳遞給 expression 的 interpreter 解釋執行
        return this.expression.interpreter(var); // 開始運算
    }
}


















