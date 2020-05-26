package com.hjc.creativePattern.AbstractFactory.concreteProduct;

import com.hjc.creativePattern.AbstractFactory.abstractProduct.Button;

public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮");
    }
}
