package com.hjc.structuralPattern.proxy.cglibDynamicProxy;

public class Client {
    public static void main(String[] args) {
        //创建返回代理类对象
        CglibProxy proxy=new CglibProxy();
        //为train返回代理类对象
        Train train=(Train)proxy.getProxy(Train.class);
        //调用方法
        train.move();
    }
}
