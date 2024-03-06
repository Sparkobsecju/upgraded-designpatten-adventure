package com.practice.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments;
    int numberOfDepartment = 0; // 保存當前陣列的物件個數

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java 專業", "Java 專業");
        addDepartment("PHP 專業", "PHP 專業");
        addDepartment("大數據專業", "大數據專業");
    }

    @Override
    public String getName() {
        return "計算機學院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numberOfDepartment] = department;
        numberOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
