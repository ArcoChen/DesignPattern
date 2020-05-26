package com.hjc.structuralPattern.proxy.dynamicProxy;

import com.hjc.structuralPattern.proxy.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Time;

public class TimeHandler implements InvocationHandler {
    private Car car;

    public TimeHandler(Car car){
        this.car=car;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("汽车开始行驶.....");
        method.invoke(car);
        System.out.println("汽车结束行驶.....");
        return null;
    }
}
