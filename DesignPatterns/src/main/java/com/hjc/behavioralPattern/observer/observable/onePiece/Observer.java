package com.hjc.behavioralPattern.observer.observable.onePiece;

import java.util.Observable;

/**
 * 订阅者类，实现Observer接口
 */
public class Observer implements java.util.Observer {
    private String name;

    public Observer(String name){
        this.name=name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Subject){
            System.out.println("坚持住"+name+"来救你啦");
        }

    }
}
