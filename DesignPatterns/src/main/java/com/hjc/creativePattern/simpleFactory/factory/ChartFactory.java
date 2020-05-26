package com.hjc.creativePattern.simpleFactory.factory;

import com.hjc.creativePattern.simpleFactory.abstractProduct.Chart;
import com.hjc.creativePattern.simpleFactory.concreteProduct.HistogramChart;
import com.hjc.creativePattern.simpleFactory.concreteProduct.PieChart;
import com.hjc.creativePattern.simpleFactory.concreteProduct.LineChart;


public class ChartFactory {
    public static Chart getChart(String chartType){
        Chart chart=null;

        if(chartType.equalsIgnoreCase("histogram")){
            chart=new HistogramChart();
            System.out.println("初始化设置柱状图");
        }else if(chartType.equalsIgnoreCase("pie")){
            chart=new PieChart();
            System.out.println("初始化设置饼状图");
        }else if(chartType.equalsIgnoreCase("line")){
            chart=new LineChart();
            System.out.println("初始化设置折线图");
        }
        return chart;
    }
}
