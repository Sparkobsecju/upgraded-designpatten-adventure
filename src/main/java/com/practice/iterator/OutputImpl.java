package com.practice.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 將具體資料的存放方式與迭代方式分離 (單一職責原則) -> 一個類別應該只有一個引起變化的原因
 * 把管理物件集合與遍歷物件集合分開
 * -> 集合改變只影響到聚合物件
 *    遍歷方式改變只影響到迭代器
 */
public class OutputImpl {
    // 學院集合
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // iterate所有學院，然後呼叫printDepartment 輸出各個學院的系
    public void printCollege() {
        // 從 collegeList 取出所有學院，Java 中 List 已經實作 Iterator
        Iterator<College> iterator = collegeList.iterator();

        while(iterator.hasNext()) {
            // 取出一個學院
            College college = iterator.next();
            System.out.println("========" + college.getName() + "========");
            printDepartment(college.createIterator()); // 得到對應的迭代器
        }
    }

    // 輸出 學院輸出系所
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
