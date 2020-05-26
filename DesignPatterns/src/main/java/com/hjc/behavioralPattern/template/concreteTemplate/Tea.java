package com.hjc.behavioralPattern.template.concreteTemplate;

import com.hjc.behavioralPattern.template.abstractTemplate.RefreshBeverage;

public class Tea extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("第二步：用热水浸泡茶叶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("第四步：啥也不干");
    }
    protected boolean isCustomerWantsCondiments(){
        return false;
    }
}
