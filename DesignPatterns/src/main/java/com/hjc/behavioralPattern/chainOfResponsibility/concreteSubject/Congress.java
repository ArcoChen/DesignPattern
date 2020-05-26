package com.hjc.behavioralPattern.chainOfResponsibility.concreteSubject;

import com.hjc.behavioralPattern.chainOfResponsibility.PurchaseRequest;
import com.hjc.behavioralPattern.chainOfResponsibility.subject.Approver;

/**
 * 董事会类：具体处理者
 */
public class Congress extends Approver {

    public Congress(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("董事会"+this.name+"审批采购单："+request.getNumber());
    }
}
