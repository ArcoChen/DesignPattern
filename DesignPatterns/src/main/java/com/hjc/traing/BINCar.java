package com.hjc.traing;

public class BINCar extends Car {
    @Override
    public void setSpeed(Integer i) {
        color.setColor();
        System.out.println("速度为："+i);
    }
}
