package com.practice.composite;

public class Client {

    public static void main(String[] args) {
        // 從大到小創建物件
        OrganizationComponent university = new University("清華大學", "頂級大學");

        // 創建 學院
        OrganizationComponent computerCollege = new College("計算機學院", "計算機學院");
        OrganizationComponent infoEngineerCollege = new College("資訊工程學院", "資訊工程學院");

        // 創建各個學院下面的系所(專業)
        computerCollege.add(new Department("軟體工程", "優良軟體工程"));
        computerCollege.add(new Department("網路工程", "優良網路工程"));
        computerCollege.add(new Department("電腦科學及技術", "電腦科學及技術是老牌的專業"));

        infoEngineerCollege.add(new Department("通信工程", "通信工程不好學"));
        infoEngineerCollege.add(new Department("資訊工程", "資訊工程好學"));

        // 將兩學院加入到 學校
        university.add(computerCollege);
        university.add(infoEngineerCollege);

         university.print();

        // infoEngineerCollege.print();
    }
}
