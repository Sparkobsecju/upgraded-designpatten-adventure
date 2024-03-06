package com.practice.visitor.bookexample;

public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程師：" + engineer.getName() +
                ", 程式碼數量：" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("經理：" + manager.getName() +
                ", 產品數量：" + manager.getProducts());
    }
}
