package com.practice.observer.improve;

// 觀察者介面，由觀察者來實作
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}
