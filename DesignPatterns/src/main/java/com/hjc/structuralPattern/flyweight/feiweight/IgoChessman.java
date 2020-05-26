package com.hjc.structuralPattern.flyweight.feiweight;

import com.hjc.structuralPattern.flyweight.UnsharedConcreteFlyweight.Coordinates;

public abstract class IgoChessman {
    public abstract String getColor();

//    public void display(){
//        System.out.println("棋子："+this.getColor());
//    }

    public void display(Coordinates coordinates){
        System.out.println("棋子颜色："+this.getColor()+",位置："+coordinates.getX()+"，"+coordinates.getY());
    }
}
