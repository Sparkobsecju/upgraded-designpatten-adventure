package com.practice.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        // 創建目標物件 (被代理物件)
        // new TeacherDaoProxy(new TeacherDao()).teach();
        TeacherDao teacherDao = new TeacherDao();

        // 創建代理物件，同時將被代理物件傳遞給代理物件
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        // 通過代理物件，呼叫到被代理物件的方法
        // 即：執行的是代理的物件，代理物件再去呼叫目標物件的方法
        teacherDaoProxy.teach();

    }
}
