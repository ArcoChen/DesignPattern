package com.hjc.behavioralPattern.state.contextControlState.concreteState;

import com.hjc.behavioralPattern.state.contextControlState.state.State;

public class LargestState extends State {
    @Override
    public void display() {
        System.out.println("四倍大小！");
    }
}
