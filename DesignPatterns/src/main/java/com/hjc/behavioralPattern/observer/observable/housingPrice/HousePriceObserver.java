package com.hjc.behavioralPattern.observer.observable.housingPrice;

import java.util.Observable;
import java.util.Observer;

public class HousePriceObserver implements Observer {
    private String name;

    public HousePriceObserver(String name){
        this.name=name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof House){
            System.out.println("购房者："+name+"，观察到房价已经调整为："+arg);
        }
    }
}
