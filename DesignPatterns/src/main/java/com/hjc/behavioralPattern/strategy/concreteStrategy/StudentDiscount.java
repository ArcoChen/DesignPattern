package com.hjc.behavioralPattern.strategy.concreteStrategy;

import com.hjc.behavioralPattern.strategy.strategy.Discount;

/**
 * 学生票折扣类：具体策略类
 */
public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("学生票");
        return price *0.8;
    }
}
