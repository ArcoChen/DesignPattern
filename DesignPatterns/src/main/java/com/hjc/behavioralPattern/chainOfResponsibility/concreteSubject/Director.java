package com.hjc.behavioralPattern.chainOfResponsibility.concreteSubject;

import com.hjc.behavioralPattern.chainOfResponsibility.PurchaseRequest;
import com.hjc.behavioralPattern.chainOfResponsibility.subject.Approver;

/**
 * 总经理类：具体处理者
 */
public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任" + this.name + "审批采购单：" + request.getNumber());
        } else {
            this.approver.processRequest(request);
        }
    }
}
