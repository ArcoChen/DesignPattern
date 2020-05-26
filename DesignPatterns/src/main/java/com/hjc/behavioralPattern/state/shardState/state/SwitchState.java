package com.hjc.behavioralPattern.state.shardState.state;

import com.hjc.behavioralPattern.state.shardState.context.Switch;

public abstract class SwitchState {
    public abstract void on(Switch s);
    public abstract void off(Switch s);
}
