package com.practice.composite;

public abstract class OrganizationComponent {

    private String name; // 名字
    private String des; // 說明

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent) {
        // 預設實作
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    // 方法 print，做成抽象的，子類別都需要實作
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
