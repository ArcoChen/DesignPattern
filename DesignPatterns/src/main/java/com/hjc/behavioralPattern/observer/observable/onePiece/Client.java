package com.hjc.behavioralPattern.observer.observable.onePiece;

public class Client {
    public static void main(String[] args) {
        Subject subject=new Subject("草帽海贼团");

        subject.addObserver(new Observer("娜美"));
        subject.addObserver(new Observer("索隆"));

        subject.attack("路飞");
    }
}
