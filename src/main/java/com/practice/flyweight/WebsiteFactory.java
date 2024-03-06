package com.practice.flyweight;

import java.util.HashMap;

// 網站工廠類別，根據需求回傳一個網站
public class WebsiteFactory {

    // 集合，充當池的作用
    private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    // 根據網站的類型，回傳一個網站，如果沒有就創建一個網站，並放入到 pool 中再返回
    public Website getWebsiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }
        return (Website) pool.get(type);
    }

    // 獲取網站分類的總數 (池中有多少個網站類型)
    public int getWebsiteCount() {
        return pool.size();
    }
}
