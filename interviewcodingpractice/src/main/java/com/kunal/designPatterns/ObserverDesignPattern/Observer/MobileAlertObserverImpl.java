package com.kunal.designPatterns.ObserverDesignPattern.Observer;

import com.kunal.designPatterns.ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    StocksObservable stocksObservable;
    String userName;

    public MobileAlertObserverImpl(String userName, StocksObservable stocksObservable) {
        this.userName = userName;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        System.out.println(userName + " product is in stock hurry up!!!");
    }
}
