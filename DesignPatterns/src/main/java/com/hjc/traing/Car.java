package com.hjc.traing;

public abstract class Car {
    protected Color color;

    public void setColor(Color color){
        this.color=color;
    }

    public abstract void setSpeed(Integer i);
}
