package com.hjc.creativePattern.singleton;

/**
 * 饿汉模式
 */
public class EagerSingleton {

    private static final EagerSingleton instance=new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}
