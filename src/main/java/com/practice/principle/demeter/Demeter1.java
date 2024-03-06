package com.practice.principle.demeter;

import java.util.ArrayList;
import java.util.List;

// 客戶端
public class Demeter1 {

    public static void main(String[] args) {
        // 創建一個 SchoolManager 物件
        SchoolManager schoolManager = new SchoolManager();
        // 輸出學院的員工 id 和 學校總部的員工訊息
        schoolManager.printAllEmployee(new CollegeManager());
    }

}

// 學校總部員工
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

// 學院的員工
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

// 管理學院員工的管理 類別
class CollegeManager {
    // 返回學院的所有員工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) { // 這裡我們增加了 10 個員工到 list
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("學院員工 id = " + i);
            list.add(emp);
        }
        return list;
    }
}

// 學校的管理 類別

// 分析 SchoolManager 類別的直接朋友類有哪些 Employee, CollegeManager
// CollegeEmployee 不是直接朋友(屬性、方法參數、回傳值)，而是一個陌生類別，這樣違背了 迪米特法則(陌生類別最好不以區域變數的形式出現在類的內部)
class SchoolManager {
    // 返回學校總部的員工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) { // 這裡我們增加了 5 個員工到 list
            Employee emp = new Employee();
            emp.setId("學校總部的員工 id = " + i);
            list.add(emp);
        }
        return list;
    }

    // 該方法完成輸出學校總部和學院員工訊息(id)
    void printAllEmployee(CollegeManager sub) {

        // 分析問題
        // 1. 這裡的 CollegeEmployee 不是 SchoolManager 的直接朋友
        // 2. CollegeEmployee 是以區域變數方式出現在 SchoolManager
        // 3. 違反了 迪米特法則

        // 獲取到學院員工
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("------------分公司員工------------");
        for (CollegeEmployee e: list1)
            System.out.println(e.getId());

        // 獲取到學校總部員工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------學校總部員工------------");
        for (Employee e: list2)
            System.out.println(e.getId());
    }
}