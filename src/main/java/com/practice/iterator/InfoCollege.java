package com.practice.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("資訊安全專業", "資訊安全專業");
        addDepartment("網路安全專業", "網路安全專業");
        addDepartment("伺服器安全專業", "伺服器安全專業");
    }

    @Override
    public String getName() {
        return "資訊工程學院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
