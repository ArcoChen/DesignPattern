package com.hjc.behavioralPattern.observer.observable.onePiece;


import java.util.Observable;

/**
 * 发布者类，继承Observable类
 */
public class Subject extends Observable {
    private String teamName;

    public Subject(String teamName){
        this.teamName=teamName;
    }

    public void attack(String name){
        System.out.println(name+"被揍啦");
        setChanged();//标注更改
        this.notifyObservers();//通知观察者
    }
}
