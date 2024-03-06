package com.practice.observer.improve;

public class Client {
    public static void main(String[] args) {
        // 創建一個 WeatherData
        WeatherData weatherData = new WeatherData();

        // 創建觀察者
        CurrentConditions currentConditions = new CurrentConditions();
        GoogleSite googleSite = new GoogleSite();

        // 註冊到 weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(googleSite);


        weatherData.removeObserver(currentConditions);
        // 測試
        System.out.println("通知各個註冊的觀察者，觀看訊息");
        weatherData.setData(10f, 100f, 30.3f);

    }
}
