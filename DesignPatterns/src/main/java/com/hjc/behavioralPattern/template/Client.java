package com.hjc.behavioralPattern.template;

import com.hjc.behavioralPattern.template.abstractTemplate.RefreshBeverage;
import com.hjc.behavioralPattern.template.concreteTemplate.Coffee;
import com.hjc.behavioralPattern.template.concreteTemplate.Tea;

public class Client {
    public static void main(String[] args) {
        System.out.println("制作咖啡............");
        RefreshBeverage refreshBeverage=new Coffee();
        refreshBeverage.prepareBeverageTemplate();
        System.out.println("咖啡制作完成");

        System.out.println("制作茶水...........");
        RefreshBeverage refreshBeverage1=new Tea();
        refreshBeverage1.prepareBeverageTemplate();
        System.out.println("茶水制作完成");
    }
}
