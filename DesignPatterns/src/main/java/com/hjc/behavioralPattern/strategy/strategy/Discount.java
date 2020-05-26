package com.hjc.behavioralPattern.strategy.strategy;

/**
 * 折扣类：抽象策略类
 */
public interface Discount {
    double calculate(double price);
}
