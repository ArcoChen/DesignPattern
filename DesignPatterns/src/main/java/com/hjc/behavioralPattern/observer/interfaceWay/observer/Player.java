package com.hjc.behavioralPattern.observer.interfaceWay.observer;

public class Player implements Observer {
    private String name;

    public Player(String name){
        this.name=name;
    }

    @Override
    public void update() {
        System.out.println("坚持住"+this.name+"来救你啦");
    }
}
