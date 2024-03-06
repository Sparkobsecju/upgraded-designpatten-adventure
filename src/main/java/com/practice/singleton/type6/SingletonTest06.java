package com.practice.singleton.type6;

public class SingletonTest06 {

    public static void main(String[] args) {
        System.out.println("Double Check Lock (DCL)單例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

// Double Check Lock (DCL)單例模式(Thread-safe, Synchronized method)
class Singleton {
    private static volatile Singleton instance;
    // 該屬性一但有更改時，便立即修改到記憶體中，亦可達到同步的效果

    private Singleton() {}

    // 提供一個靜態公有方法，使用到該方法時，加入雙重檢查程式，解決Thread安全問題，同時解決Lazy Loading問題
    // 同時保持高效率，推薦使用 (1.Thread-safe 2.Lazy Loading 3.高效率)
    // 即懶散單例模式(Thread-safe, synchronized method)
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
