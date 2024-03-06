package com.practice.observer.improve;

// 介面，讓 WeatherData 來實作
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
