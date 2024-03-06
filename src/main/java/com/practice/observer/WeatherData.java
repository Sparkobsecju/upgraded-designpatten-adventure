package com.practice.observer;

/**
 * 核心類別
 * 1. 包含最新的天氣情況訊息
 * 2. 含有 CurrentConditions 物件
 * 3. 當資料有更新時，就主動的呼叫 CurrentConditions 物件 update() 方法 (含 display)，這樣他們(接入方)就看到最新的訊息
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;
    // 加入新的第三方 a (違反ocp原則 => 觀察者模式)

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
        // 加入新的第三方 b
    }

    // 當資料有更新時，就呼叫 setData()
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 呼叫 dataChange(), 將最新的訊息 推播給 接入方 currentConditions
        dataChange();
    }
}
