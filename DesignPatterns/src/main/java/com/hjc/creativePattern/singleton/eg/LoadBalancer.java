package com.hjc.creativePattern.singleton.eg;

import java.util.*;

public class LoadBalancer {
    //私有静态成员变量，存储唯一实例
    private static LoadBalancer instance=null;

    //私有构造函数
    private LoadBalancer(){}

    //服务器集合null
    private List<String> serverList=new ArrayList<>();

    //共有静态成员方法， 返回唯一实例
    public static LoadBalancer getInstance(){
        if(instance==null){
            instance=new LoadBalancer();
        }
        return instance;
    }

    //增加服务器
    public void addServer(String server){
        serverList.add(server);
    }

    //删除服务器
    public void removeServer(String server){
        serverList.remove(server);
    }

    //获取随机服务器
    public String getServer(){
        Random random=new Random();
        int i=random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }

}
