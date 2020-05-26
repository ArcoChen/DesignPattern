package com.hjc.creativePattern.AbstractFactory.concreteProduct;

import com.hjc.creativePattern.AbstractFactory.abstractProduct.ComboBox;

public class SummerComboBox  implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示浅蓝色边框组合框");
    }
}
