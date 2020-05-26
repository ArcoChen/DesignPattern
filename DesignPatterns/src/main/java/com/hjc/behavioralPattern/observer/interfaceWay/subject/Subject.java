package com.hjc.behavioralPattern.observer.interfaceWay.subject;

import com.hjc.behavioralPattern.observer.interfaceWay.observer.Observer;

public interface Subject {
    void add(Observer observer);

    void remove(Observer observer);

    void notifyObserver(String name);
}
