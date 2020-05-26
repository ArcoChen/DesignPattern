package com.hjc.behavioralPattern.observer.abstractionWay.subject;

import com.hjc.behavioralPattern.observer.abstractionWay.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 战队控制中心类：目标类
 */
public abstract class AllyControlCenter {
    protected String allyName;
    protected List<Observer> players=new ArrayList<>();

    public void setAllyName(String allyName){
        this.allyName=allyName;
    }

    //注册方法
    public void add(Observer observer){
        System.out.println(observer.getName()+"加入"+this.allyName+"队伍");
        players.add(observer);
    }

    //注销方法
    public void remove(Observer observer){
        System.out.println(observer.getName()+"退出"+this.allyName+"队伍");
        players.remove(observer);
    }

    public abstract void notifyObserver(String name);
}
