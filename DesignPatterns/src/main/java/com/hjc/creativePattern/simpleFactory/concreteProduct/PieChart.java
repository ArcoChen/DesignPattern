package com.hjc.creativePattern.simpleFactory.concreteProduct;

import com.hjc.creativePattern.simpleFactory.abstractProduct.Chart;

public class PieChart implements Chart {
    public PieChart(){
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}
