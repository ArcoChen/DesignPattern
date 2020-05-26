package com.hjc.behavioralPattern.observer.interfaceWay;

import com.hjc.behavioralPattern.observer.interfaceWay.observer.Observer;
import com.hjc.behavioralPattern.observer.interfaceWay.observer.Player;
import com.hjc.behavioralPattern.observer.interfaceWay.subject.Subject;
import com.hjc.behavioralPattern.observer.interfaceWay.subject.Team;

public class Client {
    public static void main(String[] args) {
        Subject subject=new Team("草帽海贼团");

        Observer naMei,suoLong,shanZhi;

        naMei=new Player("娜美");
        suoLong=new Player("索隆");
        shanZhi=new Player("山治");
        subject.add(naMei);
        subject.add(suoLong);
        subject.add(shanZhi);

        subject.notifyObserver("路飞");

        subject.remove(naMei);
        subject.notifyObserver("路飞");
    }
}
