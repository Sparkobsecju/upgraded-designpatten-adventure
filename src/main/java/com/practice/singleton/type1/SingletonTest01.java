package com.practice.singleton.type1;

public class SingletonTest01 {

    public static void main(String[] args) {
        // test
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());

    }
}

// 積極單例模式(靜態變數) -> 可能造成記憶體浪費(相對於Lazy Loading)
class Singleton {

    // 1. 建構子私有化，外部不能 new
    private Singleton() {

    }

    // 2. 本類內部創建物件實例
    private final static Singleton instance = new Singleton();

    // 3. 提供一個公有的方法，傳回實例物件
    public static Singleton getInstance() {
        return instance;
    }
}
