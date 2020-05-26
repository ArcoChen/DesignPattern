package com.hjc.structuralPattern.adapter.twoWay;

public class MyCat implements ICat {
    @Override
    public void catLooks() {
        System.out.println("猫的外表");
    }

    @Override
    public void catSkill() {
        System.out.println("抓老鼠");
    }
}
