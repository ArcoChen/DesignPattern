package com.hjc.structuralPattern.facade.subSystem.concreteSubSystem;

import com.hjc.structuralPattern.facade.subSystem.subSystemInterface.CPU;

public class I7CPU implements CPU {
    @Override
    public void sellCPU() {
        System.out.println("I7CPU");
    }
}
