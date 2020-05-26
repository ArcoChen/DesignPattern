package com.hjc.structuralPattern.flyweight;

import com.hjc.structuralPattern.flyweight.UnsharedConcreteFlyweight.Coordinates;
import com.hjc.structuralPattern.flyweight.feiweight.IgoChessman;
import com.hjc.structuralPattern.flyweight.flyweightFactory.IgoChessmanFactory;

public class Client {
    public static void main(String[] args) {
        IgoChessman b1,b2,w1,w2;

        b1=IgoChessmanFactory.getIgoChessman("black");
        b2=IgoChessmanFactory.getIgoChessman("black");
        System.out.println(b1==b2);

        w1=IgoChessmanFactory.getIgoChessman("white");
        w2=IgoChessmanFactory.getIgoChessman("white");
        System.out.println(w1==w2);

//        b1.display();
//        b2.display();
//        w1.display();
//        w2.display();

        //每次调用display方法，都设置不同的坐标值（外部状态）
        b1.display(new Coordinates(1,2));
        b2.display(new Coordinates(2,2));
        w1.display(new Coordinates(3,5));
        w2.display(new Coordinates(4,7));
    }
}
