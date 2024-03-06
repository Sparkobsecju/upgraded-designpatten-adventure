package com.practice.observer;

public class Client {
    public static void main(String[] args) {
        // 創建接入方 CurrentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        // 創建 WeatherData 並將 接入方 currentConditions 傳遞到 WeatherData 中
        WeatherData weatherData = new WeatherData(currentConditions);

        // 更新天氣狀況
        weatherData.setData(30, 150, 40);

        // 天氣情況變化
        System.out.println("==========天氣情況變化==========");
        weatherData.setData(40, 160, 20);
    }
}
