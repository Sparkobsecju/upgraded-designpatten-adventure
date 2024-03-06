package com.practice.composite;

public class Department extends OrganizationComponent {

    // 沒有集合

    public Department(String name, String des) {
        super(name, des);
    }

    // add(), remove() 就不用寫了，因為他是 Leaf
    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
