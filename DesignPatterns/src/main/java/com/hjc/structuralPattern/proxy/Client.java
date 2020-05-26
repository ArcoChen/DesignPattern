package com.hjc.structuralPattern.proxy;

import com.hjc.structuralPattern.proxy.aggregateClassProxy.aggregateCar;
import com.hjc.structuralPattern.proxy.extendsStaticClassProxy.CarProxy;

public class Client {
    public static void main(String[] args) {
        //通过继承实现静态代理
        MoveAble car=new CarProxy();
        car.move();

        //通过聚合实现静态代理
        MoveAble car1=new aggregateCar(new Car());
        car1.move();
    }
}
