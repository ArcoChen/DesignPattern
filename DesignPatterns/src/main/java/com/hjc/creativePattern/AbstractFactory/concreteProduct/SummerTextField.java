package com.hjc.creativePattern.AbstractFactory.concreteProduct;

import com.hjc.creativePattern.AbstractFactory.abstractProduct.TextField;

public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅蓝色边框文本框");
    }
}
