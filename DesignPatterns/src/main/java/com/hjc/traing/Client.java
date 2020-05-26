package com.hjc.traing;

public class Client {
    public static void main(String[] args) {
        Color color;
        Car car;

        color=new RedColor();
        car=new BINCar();
        car.setColor(color);
        car.setSpeed(100);
    }
}
