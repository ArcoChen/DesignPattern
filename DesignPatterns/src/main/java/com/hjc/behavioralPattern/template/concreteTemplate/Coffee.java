package com.hjc.behavioralPattern.template.concreteTemplate;

import com.hjc.behavioralPattern.template.abstractTemplate.RefreshBeverage;

public class Coffee extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("第二步：用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("第四步：加入糖和牛奶");
    }
}
