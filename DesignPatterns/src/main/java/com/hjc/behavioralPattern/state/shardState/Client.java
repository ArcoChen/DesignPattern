package com.hjc.behavioralPattern.state.shardState;

import com.hjc.behavioralPattern.state.shardState.context.Switch;

public class Client {
    public static void main(String[] args) {
        Switch s1,s2;
        s1=new Switch("Switch1");
        s2=new Switch("Switch2");

        s1.on();
        s2.on();
        s1.off();
        s2.off();
        s2.on();
        s1.on();
    }
}
