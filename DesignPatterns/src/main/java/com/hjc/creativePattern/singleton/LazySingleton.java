package com.hjc.creativePattern.singleton;

/**
 * 懒汉模式
 */
public class LazySingleton {
    private /*volatile*/ static  LazySingleton instance=null;

    private LazySingleton(){}

//    public static synchronized LazySingleton getInstance(){
//        if(instance==null){
//            instance=new LazySingleton();
//        }
//        return instance;
//    }

    public static LazySingleton getInstance(){
        if(instance==null){
            synchronized (LazySingleton.class){
                instance=new LazySingleton();
            }
        }
        return instance;
    }

//    public static LazySingleton getInstance(){
//        //第一重判断
//        if(instance==null){
//            //锁定代码块
//            synchronized (LazySingleton.class){
//                //第二重判断
//                if(instance==null){
//                    //创建单例实例
//                    instance=new LazySingleton();
//                }
//            }
//        }
//    }


}
