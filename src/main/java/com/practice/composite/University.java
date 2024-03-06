package com.practice.composite;

import java.util.ArrayList;
import java.util.List;

// University 就是 Composite，可以管理 College
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    // 建構子
    public University(String name, String des) {
        super(name, des);
    }

    // Override add()
    @Override
    protected void add(OrganizationComponent organizationComponent) {
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
