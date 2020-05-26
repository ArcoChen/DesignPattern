package com.hjc.behavioralPattern.observer.abstractionWay;

import com.hjc.behavioralPattern.observer.abstractionWay.observer.Observer;
import com.hjc.behavioralPattern.observer.abstractionWay.observer.Player;
import com.hjc.behavioralPattern.observer.abstractionWay.subject.AllyControlCenter;
import com.hjc.behavioralPattern.observer.abstractionWay.subject.ConcreteAllyControlCenter;

public class Client {
    public static void main(String[] args) {
        //定义观察目标对象
        AllyControlCenter allyControlCenter=new ConcreteAllyControlCenter("草帽海贼团");

        //定义观察者对象
        Observer luFei,naMei,suoLong,shanZhi;

        luFei=new Player("路飞");
        allyControlCenter.add(luFei);

        naMei=new Player("娜美");
        allyControlCenter.add(naMei);

        suoLong=new Player("索隆");
        allyControlCenter.add(suoLong);

        shanZhi=new Player("山治");
        allyControlCenter.add(shanZhi);

        luFei.beAttacked(allyControlCenter);
    }
}
