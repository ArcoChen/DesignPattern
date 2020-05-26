package com.hjc.structuralPattern.adapter.twoWay;

public class MyDog implements IDog {
    @Override
    public void dogLooks() {
        System.out.println("狗的外表");
    }

    @Override
    public void dogKill() {
        System.out.println("看门");
    }
}
