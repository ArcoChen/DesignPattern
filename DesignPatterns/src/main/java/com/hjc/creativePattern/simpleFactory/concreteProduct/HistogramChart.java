package com.hjc.creativePattern.simpleFactory.concreteProduct;

import com.hjc.creativePattern.simpleFactory.abstractProduct.Chart;

public class HistogramChart implements Chart {
     public HistogramChart(){
         System.out.println("创建柱状图");
     }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
