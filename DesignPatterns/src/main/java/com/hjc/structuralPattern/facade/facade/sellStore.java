package com.hjc.structuralPattern.facade.facade;

import com.hjc.structuralPattern.facade.subSystem.concreteSubSystem.AsusBoard;
import com.hjc.structuralPattern.facade.subSystem.concreteSubSystem.GigaByteVideoCard;
import com.hjc.structuralPattern.facade.subSystem.concreteSubSystem.I7CPU;
import com.hjc.structuralPattern.facade.subSystem.subSystemInterface.Board;
import com.hjc.structuralPattern.facade.subSystem.subSystemInterface.CPU;
import com.hjc.structuralPattern.facade.subSystem.subSystemInterface.VideoCard;

public class sellStore implements Fade{
    private Board asusBoard;
    private CPU i7Cpu;
    private VideoCard gigaByteVideoCard;

    public sellStore(){
        asusBoard=new AsusBoard();
        i7Cpu=new I7CPU();
        gigaByteVideoCard=new GigaByteVideoCard();
    }


    @Override
    public void sellBoard() {
        asusBoard.sellBoard();
    }

    @Override
    public void sellCpu() {
        i7Cpu.sellCPU();
    }

    @Override
    public void sellVideoCard() {
        gigaByteVideoCard.sellVideoCard();
    }

    @Override
    public void sellBoardAndCpu() {
        asusBoard.sellBoard();
        i7Cpu.sellCPU();
    }

    @Override
    public void sellCpuAndVideoCard() {
        i7Cpu.sellCPU();
        gigaByteVideoCard.sellVideoCard();
    }
}
