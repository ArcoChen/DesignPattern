package com.hjc.behavioralPattern.chainOfResponsibility;

import com.hjc.behavioralPattern.chainOfResponsibility.concreteSubject.Congress;
import com.hjc.behavioralPattern.chainOfResponsibility.concreteSubject.Director;
import com.hjc.behavioralPattern.chainOfResponsibility.concreteSubject.President;
import com.hjc.behavioralPattern.chainOfResponsibility.concreteSubject.VicePresident;
import com.hjc.behavioralPattern.chainOfResponsibility.subject.Approver;

public class Client {
    public static void main(String[] args) {
        Approver director,vicePresident,president,congress;

        director=new Director("索隆");
        vicePresident=new VicePresident("娜美");
        president=new President("路飞");
        congress=new Congress("草帽海盗团");

        //创建职责链
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);

        PurchaseRequest salt=new PurchaseRequest(5000,10001,"买盐");
        director.processRequest(salt);

        PurchaseRequest meat=new PurchaseRequest(80000,10002,"卖肉");
        director.processRequest(meat);

        PurchaseRequest sword=new PurchaseRequest(300000,10003,"买刀");
        director.processRequest(sword);

        PurchaseRequest ship=new PurchaseRequest(800000,10004,"买船");
        director.processRequest(ship);
    }
}
