package com.hjc.structuralPattern.adapter.oneWay.adaptee;

public class TecentMediaPlayer implements AdvanceMediaPlayer {
    @Override
    public void playAudio(String name) {
        System.out.println("tecent client is playing audio now,name:"+name);
    }

    @Override
    public void playVideo(String name) {
        System.out.println("tecent client is playing video now,name:"+name);
    }
}
