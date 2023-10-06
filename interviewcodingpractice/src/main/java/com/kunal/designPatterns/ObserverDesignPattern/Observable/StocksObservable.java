package com.kunal.designPatterns.ObserverDesignPattern.Observable;

import com.kunal.designPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockCount);

    int getStockCount();
}
