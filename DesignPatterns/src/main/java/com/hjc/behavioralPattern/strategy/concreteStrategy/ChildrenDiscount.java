package com.hjc.behavioralPattern.strategy.concreteStrategy;

import com.hjc.behavioralPattern.strategy.strategy.Discount;

/**
 * 儿童票折扣类：具体策略类
 */
public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        return price * 0.6;
    }
}
