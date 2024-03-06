package com.practice.visitor.bookexample;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("王經理"));
        mStaffs.add(new Engineer("工程師-小明"));
        mStaffs.add(new Engineer("工程師-小美"));
        mStaffs.add(new Engineer("工程師-彬彬"));
        mStaffs.add(new Engineer("工程師-傑哥"));
    }

    public void showReport(Visitor visitor) {
        for (Staff staff: mStaffs)
            staff.accept(visitor);
    }
}
