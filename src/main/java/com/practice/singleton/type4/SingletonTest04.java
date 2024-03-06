package com.practice.singleton.type4;

public class SingletonTest04 {

    public static void main(String[] args) {
        System.out.println("懶散單例模式2(thread-safe)");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

// 懶散單例模式(Thread-safe, Synchronized method)
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    // 提供一個靜態公有方法，使用到該方法時，才去創建 instance (Lazy loading -> 可用於多 Thread 環境)
    // -> 效率太低了 -> getInstance()時常發生，每次取得皆要進行 synchronized -> 可用但不推薦使用
    // 即懶散單例模式(Thread-safe, synchronized method)
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
