package com.hjc.structuralPattern.facade.subSystem.concreteSubSystem;

import com.hjc.structuralPattern.facade.subSystem.subSystemInterface.VideoCard;

public class GigaByteVideoCard implements VideoCard {
    @Override
    public void sellVideoCard() {
        System.out.println("技嘉1060 6G");
    }
}
