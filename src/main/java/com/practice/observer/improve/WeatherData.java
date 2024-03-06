package com.practice.observer.improve;

import java.util.ArrayList;

/**
 * 核心類別
 * 1. 包含最新的天氣情況訊息
 * 2. 含有 觀察者集合 ，使用 ArrayList 管理
 * 3. 當資料有更新時，就主動的呼叫 ArrayList, 通知所有的 (接入方) 就看到最新的訊息
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;

    // 觀察者集合
    private ArrayList<Observer> observers;

    // 加入新的第三方


    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        // 呼叫接入方的 update()
        // currentConditions.update(getTemperature(), getPressure(), getHumidity());
        notifyObservers();
    }

    // 當資料有更新時，就呼叫 setData()
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 呼叫 dataChange(), 將最新的訊息 推播給 接入方 currentConditions
        dataChange();
    }

    // 註冊一個觀察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 移除一個觀察者
    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o))
            observers.remove(o);
    }

    // 遍歷所有觀察者並通知
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }
}
