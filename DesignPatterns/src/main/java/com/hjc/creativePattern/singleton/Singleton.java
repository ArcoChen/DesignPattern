package com.hjc.creativePattern.singleton;

/**
 * IoDH 可实现延时加载，又可保证线程安全
 */
public class Singleton {
    private Singleton(){}

    private static class HolderClass{
        private final static Singleton instance=new Singleton();
    }

    public static Singleton getInstance(){
        return HolderClass.instance;
    }

}
