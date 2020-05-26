package com.hjc.behavioralPattern.strategy.context;

import com.hjc.behavioralPattern.strategy.strategy.Discount;

/**
 * 电影票类：环境类
 */
public class MovieTicket {
    private double price;
    //维持一个对抽象折扣类的引用
    private Discount discount;

    public double getPrice() {
        return discount.calculate(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
