package com.hjc.behavioralPattern.memento.memento;

import com.hjc.behavioralPattern.memento.originator.Chessman;

public class ChessmanMemento {
    private String label;
    private int x;
    private int y;

    public ChessmanMemento(String label,int x,int y){
        this.label=label;
        this.x=x;
        this.y=y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
