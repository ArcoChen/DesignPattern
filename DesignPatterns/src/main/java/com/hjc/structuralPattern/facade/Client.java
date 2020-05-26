package com.hjc.structuralPattern.facade;

import com.hjc.structuralPattern.facade.facade.Fade;
import com.hjc.structuralPattern.facade.facade.sellStore;

public class Client {
    public static void main(String[] args) {
        Fade facade=new sellStore();
        facade.sellBoard();

        facade.sellCpuAndVideoCard();
    }
}
