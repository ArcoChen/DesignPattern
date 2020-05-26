package com.hjc.creativePattern.AbstractFactory.concreteProduct;

import com.hjc.creativePattern.AbstractFactory.abstractProduct.ComboBox;

public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示浅绿色边框组合框");
    }
}
