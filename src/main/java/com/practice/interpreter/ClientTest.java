package com.practice.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr(); // a+b
        HashMap<String, Integer> var = getValue(expStr); // var {a=10, b=20}
        Calculator calculator = new Calculator(expStr);
        System.out.println("運算結果：" + expStr + "=" + calculator.run(var));
    }

    // 獲取表達式
    public static String getExpStr() throws IOException {
        System.out.println("輸入表達式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();

    }

    // 獲取值
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}


/**
 * 1) Context: 是環境角色，含有解釋器之外的一些全局資訊
 * 2) AbstractExpression: 抽象表達式，聲明一個抽象的解釋操作，這個介面為抽象語法樹中所有節點定義一個解釋操作
 * 3) TerminalExpression: 終結符表達式，實作與文法中的終結符相關的解釋操作
 * 4) NonTerminalExpression: 非終結符表達式，為文法中的非終結符實作解釋操作
 * 5) 說明： 通過 Client 輸入一個表達式，這個表達式交給 Context 進行處理，Context 交給相應的 AbstractExpression 進行解釋，解釋完畢後返回結果
 */