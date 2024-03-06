package com.practice.iterator;

import java.util.Iterator;

// 迭代器模式：提供一種遍歷集合元素的統一介面，用一致的方法遍歷集合元素，不需要知道集合物件的底層表示，不暴露其內部的結構(客戶端不用知道)
public interface College {
    public String getName();

    // 增加系所的方法
    public void addDepartment(String name, String desc);

    // 回傳一個迭代器，iterate
    public Iterator createIterator();
}

/**
 * 迭代器模式
 * 優點
 * 1. 提供一個統一的方法遍歷物件，客戶不用再考慮聚合的類型，使用一種方法就可以遍歷物件了
 * 2. 隱藏了聚合的內部結構，客戶端要遍歷聚合的時候只能取到迭代器，而不會知道聚合的具體組成
 * 3. 提供一種設計思想，就是一個類別應該只有一個引起變化的原因 (叫做 "單一職責原則" )。
 *    在聚合類別中，我們把迭代器分開，就是要把管理物件集合和遍歷物件集合的責任分開，這樣一來
 *    集合改變的話，只影響到聚合物件。而如果遍歷方式改變的話，只影響到迭代器。
 * 4. 當要展示一組相似物件，或者遍歷一組相同物件時使用，適合使用迭代器模式
 *
 * 缺點
 * 每個聚合物件都要一個迭代器，會生成多個迭代器不好管理類別
 */


/**
 * 組合模式 -> 迭代器模式，為展示內部組成
 */