package com.practice.singleton.type3;

public class SingletonTest03 {

    public static void main(String[] args) {
        System.out.println("懶散單例模式(Not thread-safe)");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

// 懶散單例模式(Not thread-safe, Synchronized method)
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    // 提供一個靜態公有方法，使用到該方法時，才去創建 instance (Lazy loading -> 用於單 Thread 環境)
    // -> 實際開發中，不要使用這種方式
    // 即懶散單例模式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
