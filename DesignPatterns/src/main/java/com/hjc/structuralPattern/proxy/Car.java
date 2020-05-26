package com.hjc.structuralPattern.proxy;

import com.hjc.structuralPattern.proxy.MoveAble;

/**
 * 实现接口方法
 */
public class Car implements MoveAble {
    @Override
    public void move() {
        System.out.println("车在行驶");
    }
}
