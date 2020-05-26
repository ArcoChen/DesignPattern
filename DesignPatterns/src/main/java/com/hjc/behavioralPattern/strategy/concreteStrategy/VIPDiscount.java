package com.hjc.behavioralPattern.strategy.concreteStrategy;

import com.hjc.behavioralPattern.strategy.strategy.Discount;

/**
 * VIP会员折扣类：具体策略类
 */
public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return price*0.5;
    }
}
