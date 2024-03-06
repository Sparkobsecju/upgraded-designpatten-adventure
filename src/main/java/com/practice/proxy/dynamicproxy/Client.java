package com.practice.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        // 創建目標物件
        ITeacherDao target = new TeacherDao();

        // 給目標物件，創建代理物件，可以轉換成 ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        // proxyInstance = class jdk.proxy1.$Proxy0 記憶體中動態生程了代理物件
        System.out.println("proxyInstance = " + proxyInstance.getClass());

        System.out.println("--------------");

        // 通過代理物件，呼叫目標物件的方法
        System.out.println("ITeacherDao -> TeacherDao() -> teach()");
        proxyInstance.teach();

        System.out.println("--------------");
        System.out.println("ITeacherDao -> TeacherDao() -> sayHello(String name)");
        proxyInstance.sayHello(" tom ");
    }
}
