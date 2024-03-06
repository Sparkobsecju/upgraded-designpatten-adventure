package com.practice.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    // List 中存放了 Department
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    // 建構子
    public College(String name, String des) {
        super(name, des);
    }

    // Override add()
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // 將來實際業務中， College 的 add() 和 University add() 不一定完全一樣
        organizationComponents.add(organizationComponent);
    }

    // Override remove()
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    // print()方法，就是輸出 University 包含的學院
    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
        // iterate organizationComponents
        for (OrganizationComponent organizationComponent: organizationComponents)
            organizationComponent.print();
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
