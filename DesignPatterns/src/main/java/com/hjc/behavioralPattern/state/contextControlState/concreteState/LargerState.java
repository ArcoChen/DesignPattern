package com.hjc.behavioralPattern.state.contextControlState.concreteState;

import com.hjc.behavioralPattern.state.contextControlState.state.State;

public class LargerState extends State {
    @Override
    public void display() {
        System.out.println("两倍大小！");
    }
}
