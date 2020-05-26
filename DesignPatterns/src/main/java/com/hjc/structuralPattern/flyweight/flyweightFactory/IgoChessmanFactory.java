package com.hjc.structuralPattern.flyweight.flyweightFactory;

import com.hjc.structuralPattern.flyweight.ContreceFlyweight.BlackChessman;
import com.hjc.structuralPattern.flyweight.ContreceFlyweight.WhiteChessman;
import com.hjc.structuralPattern.flyweight.feiweight.IgoChessman;

import java.util.HashMap;

public class IgoChessmanFactory {
    //私有化自己
    private static final IgoChessmanFactory igoChessmanFactory=new IgoChessmanFactory();

    //创建享元池
    private static HashMap<String,IgoChessman> ht;

    private IgoChessmanFactory(){
        ht=new HashMap<>();
        IgoChessman white,black;
        white=new WhiteChessman();
        ht.put("white",white);
        black=new BlackChessman();
        ht.put("black",black);
    }

    //提供全局访问方法
    public static IgoChessmanFactory getInstance(){
        return igoChessmanFactory;
    }

    //工厂方法创建对象
    public static IgoChessman getIgoChessman(String name){
        return ht.get(name);
    }
}
