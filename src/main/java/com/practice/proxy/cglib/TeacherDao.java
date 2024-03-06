package com.practice.proxy.cglib;

public class TeacherDao {
    public String teach() {
        System.out.println(" 老師授課中，我是 cglib 代理，不需要實作介面");
        return "hello";
    }
}
