package com.practice.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    // 這裡我們需要知道 Department 是以怎樣的方式存放 => 陣列
    Department[] departments;
    int position = 0; // iteration 的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    // 刪除的方法，預設空實作
    @Override
    public void remove() {

    }
}
