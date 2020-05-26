package com.hjc.behavioralPattern.state.contextControlState;

import com.hjc.behavioralPattern.state.contextControlState.context.Screen;

public class Client {
    public static void main(String[] args) {
        Screen screen=new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
    }
}
