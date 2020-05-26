package com.hjc.structuralPattern.proxy.extendsStaticClassProxy;

import com.hjc.structuralPattern.proxy.Car;

/**
 * 继承类，实现父类中的方法，并增加一些额外的功能
 */
public class CarProxy extends Car {
    @Override
    public void move(){
        System.out.println("汽车开始行驶.....");
        super.move();
        System.out.println("汽车结束行驶.....");
    }
}
