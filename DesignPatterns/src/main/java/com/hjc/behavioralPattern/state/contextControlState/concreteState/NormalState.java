package com.hjc.behavioralPattern.state.contextControlState.concreteState;

import com.hjc.behavioralPattern.state.contextControlState.state.State;

public class NormalState extends State {
    @Override
    public void display() {
        System.out.println("正常大小！");
    }
}
