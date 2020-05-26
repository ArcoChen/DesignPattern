package com.hjc.creativePattern.simpleFactory;

import com.hjc.creativePattern.simpleFactory.factory.ChartFactory;
import com.hjc.creativePattern.simpleFactory.abstractProduct.Chart;

public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart= ChartFactory.getChart("histogram");
        chart.display();

        chart=ChartFactory.getChart("line");
        chart.display();
    }
}
