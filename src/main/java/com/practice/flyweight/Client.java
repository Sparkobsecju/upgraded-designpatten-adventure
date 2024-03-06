package com.practice.flyweight;

public class Client {

    public static void main(String[] args) {
        // 創建一個工廠類
        WebsiteFactory factory = new WebsiteFactory();

        // 客戶要一個以新聞形式發布的網站
        Website website1 = factory.getWebsiteCategory("新聞");

        website1.use(new User("Tom"));

        // 客戶要一個以新聞形式發布的網站
        Website website2 = factory.getWebsiteCategory("臉書");

        website2.use(new User("Jacky"));


        // 客戶要一個以新聞形式發布的網站
        Website website3 = factory.getWebsiteCategory("臉書");

        website3.use(new User("Smith"));

        // 客戶要一個以新聞形式發布的網站
        Website website4 = factory.getWebsiteCategory("臉書");

        website4.use(new User("King"));

        System.out.println("網站的分類共 = " + factory.getWebsiteCount() +
                ", website3 == website4 : " + (website3 == website4) );
    }
}
