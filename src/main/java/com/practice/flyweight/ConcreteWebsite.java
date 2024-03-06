package com.practice.flyweight;

// 具體網站
public class ConcreteWebsite extends Website {

    // 共享的部分，內部狀態
    private String type = ""; // 網站發布的形式(型態)

    // 建構子
    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("網站的發布型態為：" + type + " 在使用中.. (使用者是" + user.getName() +
                ")\n -> 應用程式物件("+ getClass() + ")\n");
    }
}
