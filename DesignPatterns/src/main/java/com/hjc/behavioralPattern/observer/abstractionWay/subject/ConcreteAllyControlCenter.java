package com.hjc.behavioralPattern.observer.abstractionWay.subject;

import com.hjc.behavioralPattern.observer.abstractionWay.observer.Observer;

public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName){
        System.out.println("队伍创建成功");
        this.allyName=allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName+"战队紧急通知，盟友"+name+"被揍啦");
        //遍历观察者，调用每个队友（除自己）的支援方法
        for(Observer observer:players){
            if(!observer.getName().equalsIgnoreCase(name)){
                observer.help();
            }
        }
    }
}
