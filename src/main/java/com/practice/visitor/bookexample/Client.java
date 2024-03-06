package com.practice.visitor.bookexample;

public class Client {
    public static void main(String[] args) {
        // 建置報表
        BusinessReport report = new BusinessReport();
        System.out.println("======= 給CEO看的報表 =======");
        // 設定訪問者，這裡是CEO
        report.showReport(new CEOVisitor());
        System.out.println("\n======= 給CTO看的報表 =======");
        // 注入另一個訪問者，CTO
        report.showReport(new CTOVisitor());
    }
}
