package com.hjc.creativePattern.AbstractFactory.concreteProduct;

import com.hjc.creativePattern.AbstractFactory.abstractProduct.TextField;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅绿色边框文本框");
    }
}
