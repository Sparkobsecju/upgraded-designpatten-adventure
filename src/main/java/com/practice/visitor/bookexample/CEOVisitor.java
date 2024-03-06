package com.practice.visitor.bookexample;

public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程師：" + engineer.getName() + ", KPI：" + engineer.getKpi());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("經理：" + manager.getName() + ", KPI：" + manager.getKpi() +
                ", 新產品數量：" + manager.getProducts());
    }
}
