package com.hjc.structuralPattern.proxy.dynamicProxy;

import com.hjc.structuralPattern.proxy.Car;
import com.hjc.structuralPattern.proxy.MoveAble;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Client {
    public static void main(String[] args) {
        Car car=new Car();
        InvocationHandler invocationHandler=new TimeHandler(car);

        Class<?> cls=car.getClass();

        MoveAble moveAble=(MoveAble) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),invocationHandler);
        moveAble.move();
    }
}
