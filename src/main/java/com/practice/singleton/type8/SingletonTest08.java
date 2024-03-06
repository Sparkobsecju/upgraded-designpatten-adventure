package com.practice.singleton.type8;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOK();
    }
}

// 使用列舉，可以實現單例模式，推薦使用
enum Singleton { // JDK 1.5，防止反序列化重新創建新的物件
    INSTANCE; // 屬性 (保證單例)
    public void sayOK() {
        System.out.println("OK~");
    }
}
