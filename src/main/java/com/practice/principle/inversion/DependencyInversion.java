package com.practice.principle.inversion;

public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "電子信箱訊息: hello, world";
    }
}

// 完成 Person 接收消息的功能
// 方式1完成
// 1. 簡單，比較容易想到
// 2. 如果我們獲取的物件是 line, 簡訊等等，則新增類，同時 Person也要增加相應接收的方法
// 3. 解決思路: 引入一個抽象的介面 IReceiver, 表示接收者，這樣Person類與介面IReceiver發生依賴
//    因為 Email, line 等等屬於接收的範疇，他們各自實作 IReceiver 介面就可，這樣我們就符合依賴倒置原則
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
