package com.hjc.behavioralPattern.observer.interfaceWay.subject;

import com.hjc.behavioralPattern.observer.interfaceWay.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Team implements Subject {

    private List<Observer> players = new ArrayList<>();

    public Team(String teamName) {
        System.out.println(teamName+ "队伍成立啦");
    }

    @Override
    public void add(Observer observer) {
        players.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        players.remove(observer);
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(name + "被揍啦");
        for(Observer observer:players){
            observer.update();
        }
    }
}
