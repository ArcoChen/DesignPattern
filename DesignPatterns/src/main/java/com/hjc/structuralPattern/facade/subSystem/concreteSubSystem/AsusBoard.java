package com.hjc.structuralPattern.facade.subSystem.concreteSubSystem;

import com.hjc.structuralPattern.facade.subSystem.subSystemInterface.Board;

public class AsusBoard implements Board {
    @Override
    public void sellBoard() {
        System.out.println("华硕主板");
    }
}
