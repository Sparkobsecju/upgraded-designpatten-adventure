package com.practice.singleton.type5;

public class SingletonTest05 {

    public static void main(String[] args) {
        System.out.println("懶散單例模式 - 問題版");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

// 不使用 -> 禁止
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    // 提供一個靜態公有方法，使用到該方法時，才去創建 instance (不使用)
    // if (instance == null) 並無法解決多線程請求，可能導致多個 Singleton 同時出現的問題
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
