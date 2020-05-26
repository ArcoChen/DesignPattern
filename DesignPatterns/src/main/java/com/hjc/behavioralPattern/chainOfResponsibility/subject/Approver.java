package com.hjc.behavioralPattern.chainOfResponsibility.subject;

import com.hjc.behavioralPattern.chainOfResponsibility.PurchaseRequest;

public abstract class Approver {
    //定义后继对象
    protected Approver approver;
    //审批者姓名
    protected String name;

    public Approver(String name){
        this.name=name;
    }

    public void setSuccessor(Approver approver){
        this.approver=approver;
    }

    public abstract void processRequest(PurchaseRequest request);
}
