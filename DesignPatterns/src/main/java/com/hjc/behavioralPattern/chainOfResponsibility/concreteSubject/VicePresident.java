package com.hjc.behavioralPattern.chainOfResponsibility.concreteSubject;

import com.hjc.behavioralPattern.chainOfResponsibility.PurchaseRequest;
import com.hjc.behavioralPattern.chainOfResponsibility.subject.Approver;

/**
 * 副董事长类：具体处理者
 */
public class VicePresident extends Approver {

    public VicePresident(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount()<100000){
            System.out.println("副董事长"+this.name+"审批采购单："+request.getNumber());
        }else{
            this.approver.processRequest(request);
        }
    }
}
