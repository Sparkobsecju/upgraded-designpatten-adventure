package com.practice.proxy.cglib;

public class Client {
    public static void main(String[] args) throws Exception {
        // 創建目標物件
        TeacherDao target = new TeacherDao();
        // 獲取到代理物件，並且將目標物件傳遞給代理物件
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        // 執行代理物件的方法，觸發 intercept() 方法，從而實現 對目標物件的呼叫
        String res = proxyInstance.teach();
        System.out.println("res = " + res);

//        if (proxyInstance instanceof TeacherDao) {
//            TeacherDao proxy = (TeacherDao) proxyInstance;
//            String res = proxy.teach();
//            System.out.println("res = " + res);
//        } else {
//            System.out.println("代理物件不是 TeacherDao 的實例");
//        }

    }
}

/**
 * 1. 代理模式；為一個物件提供一個替身，以控制對這個物件的訪問。即通過代理物件訪問目標物件，這樣做的好處是：可以在目標物件實現的基礎上，增強額外的功能操作，即擴展目標物件的功能
 * 2. 被代理的物件可以是遠程物件、創建開銷大的物件或需要安全控制的物件
 * 3. 代理模式有不同的形式，主要有三種 靜態代理、動態代理(JDK 代理、介面代理)和Cglib代理(可以在記憶體動態地創建物件，而不需要實作介面，他是屬於動態代理的範疇)
 */
