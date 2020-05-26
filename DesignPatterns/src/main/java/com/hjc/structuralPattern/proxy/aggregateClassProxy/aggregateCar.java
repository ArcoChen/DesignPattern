package com.hjc.structuralPattern.proxy.aggregateClassProxy;

import com.hjc.structuralPattern.proxy.MoveAble;
import com.hjc.structuralPattern.proxy.Car;

/**
 * 通过聚合实现静态代理
 */
public class aggregateCar implements MoveAble {
    private Car car;

    public aggregateCar(Car car){
        this.car=car;
    }

    @Override
    public void move() {
        System.out.println("汽车开始行驶.....");
        car.move();
        System.out.println("汽车结束行驶.....");
    }
}
