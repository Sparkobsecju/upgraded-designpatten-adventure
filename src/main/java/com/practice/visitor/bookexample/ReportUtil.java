package com.practice.visitor.bookexample;

public class ReportUtil {
    public void visit(Staff staff) {
        if (staff instanceof Manager) {
            Manager manager = (Manager) staff;
            System.out.println("經理：" + manager.getName() + ", KPI：" + manager.getKpi() +
                    ", 新產品數量：" + manager.getProducts());
        } else {
            Engineer engineer = (Engineer) staff;
            System.out.println("工程師：" + engineer.getName() + ", KPI：" + engineer.getKpi());
        }
    }
}
