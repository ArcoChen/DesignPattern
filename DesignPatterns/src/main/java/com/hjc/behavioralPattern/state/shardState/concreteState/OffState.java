package com.hjc.behavioralPattern.state.shardState.concreteState;

import com.hjc.behavioralPattern.state.shardState.context.Switch;
import com.hjc.behavioralPattern.state.shardState.state.SwitchState;

/**
 * 关闭状态z
 */
public class OffState extends SwitchState {
    @Override
    public void on(Switch s) {
        System.out.println("打开！");
        s.setState(Switch.getState("on"));
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关闭！");
    }
}
