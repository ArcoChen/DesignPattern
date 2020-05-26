package com.hjc.behavioralPattern.observer.abstractionWay.observer;

import com.hjc.behavioralPattern.observer.abstractionWay.subject.AllyControlCenter;

/**
 * 战队成员类：具体观察者类
 */
public class Player implements Observer {
    private String name;

    public Player(String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void help() {
        System.out.println("坚持住"+this.name+"来救你啦");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name+"被揍啦");
        acc.notifyObserver(name);
    }
}
