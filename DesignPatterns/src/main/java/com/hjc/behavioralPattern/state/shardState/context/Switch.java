package com.hjc.behavioralPattern.state.shardState.context;

import com.hjc.behavioralPattern.state.shardState.state.SwitchState;

/**
 * 开关类
 */
public class Switch {
    //定义三个静态状态，其中state为当前状态
    private static SwitchState state,onState,offState;
    private String name;

    public Switch(String name){
        this.name=name;
    }

    public void setState(SwitchState state){
        this.state=state;
    }

    public static SwitchState getState(String type){
        if(type.equalsIgnoreCase("on")){
            return onState;
        }else{
            return offState;
        }
    }

    public  void on(){
        System.out.println(name);
        state.on(this);
    }

    public void off(){
        System.out.println(name);
        state.off(this);
    }
}
