package com.practice.singleton.type7;

public class SingletonTest07 {

    public static void main(String[] args) {
        System.out.println("使用靜態內部類別單例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

// 靜態內部類別完成，推薦使用
class Singleton {
    private static Singleton instance;
    // 該屬性一但有更改時，便立即修改到記憶體中，亦可達到同步的效果

    // 建構子私有化
    private Singleton() {}

    // 寫一個靜態內部類別，該類別中有一個靜態屬性 Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供一個靜態的公有方法，直接回傳 SingletonInstance.INSTANCE
    public static Singleton getInstance() {

        return SingletonInstance.INSTANCE;
    }

    // 1. 外部類別載入時，靜態內部類別不會加載，保證 Lazy Loading
    // 2. 當我們載入靜態內部類別時，才去初始化 Singleton 的實例(此時Thread-safe，別的Thread無法進入)
    // 推薦使用
}
