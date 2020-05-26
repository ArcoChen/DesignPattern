package com.hjc.creativePattern.singleton.eg;

public class TaskManager {
    private static TaskManager tm=null;

    //初始化任务管理器
    private TaskManager(){}

    //显示进程
    public void displayProcesses(){}

    //显示服务
    public void displayServices(){}

    public static TaskManager getInstance(){
        if(tm==null){
            tm=new TaskManager();
        }
        return tm;
    }
}
