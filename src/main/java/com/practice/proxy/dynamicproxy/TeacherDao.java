package com.practice.proxy.dynamicproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println(" 老師授課中...... ");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
