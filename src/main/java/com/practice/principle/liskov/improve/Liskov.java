package com.practice.principle.liskov.improve;

public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3 = " + a.func1(11, 3));
        System.out.println("1-8 = " + a.func1(1, 8));

        System.out.println("-------------------------");
        B b = new B();
        // 因為 B 不再繼承 A，因此呼叫者不會再認為 func1 是求 減法
        // 呼叫完成的功能就會很明確
        System.out.println("11+3 = " + b.func1(11, 3)); // 這裡的本意是求出 11 + 3
        System.out.println("1+8 = " + b.func1(1, 8)); // 1+8
        System.out.println("11+3+9 = " + b.func2(11, 3));

        // 使用組合仍然可以使用到 A 類別的相關方法
        System.out.println("-------------------------");
        System.out.println("使用組合Composition(B裡面有A元件)");
        System.out.println("11-3 = " + b.func3(11, 3));
    }
}

// 創建一個更加基礎的 Base
class Base {
    // 把更加基礎的方法和屬性寫到Base類別
}

// A 類
class A extends Base {
    // 返回兩個數的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B 類繼承了 A
// 增加一個功能：完成兩個數相加，然後和 9 求和
class B extends Base {
    // 如果 B 需要使用 A 的方法，使用組合關係(實心菱形線 Composition)
    private A a = new A();

    // 這裡，Override 了 A 類的方法(原本是 a-b )，可能是無意識
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    // 我們仍然想使用 A 的方法
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}