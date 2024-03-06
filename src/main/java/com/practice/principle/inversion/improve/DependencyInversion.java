package com.practice.principle.inversion.improve;

public class DependencyInversion {

    public static void main(String[] args) {
        // 客戶端無須改變
        Person person = new Person();
        person.receive(new Email());

        person.receive(new Line());
    }
}

// 定義介面
interface IReceiver {
    public String getInfo();
}
class Email implements IReceiver{
    public String getInfo() {
        return "電子信箱訊息: hello, world";
    }
}

// 增加 Line
class Line implements IReceiver {
    public String getInfo() {
        return "line訊息: hello, ok";
    }
}

// 方式2
class Person {
    // 這裡我們是對介面的依賴
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
