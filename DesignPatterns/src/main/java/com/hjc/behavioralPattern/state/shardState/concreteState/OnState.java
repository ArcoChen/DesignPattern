package com.hjc.behavioralPattern.state.shardState.concreteState;

import com.hjc.behavioralPattern.state.shardState.context.Switch;
import com.hjc.behavioralPattern.state.shardState.state.SwitchState;

/**
 * 打开状态
 */
public class OnState extends SwitchState {
    @Override
    public void on(Switch s) {
        System.out.println("已经打开！");
    }

    @Override
    public void off(Switch s) {
        System.out.println("关闭！");
        s.setState(Switch.getState("off"));
    }
}
