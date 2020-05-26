package com.hjc.creativePattern.simpleFactory.concreteProduct;

import com.hjc.creativePattern.simpleFactory.abstractProduct.Chart;

public class LineChart implements Chart {
    public LineChart(){
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
