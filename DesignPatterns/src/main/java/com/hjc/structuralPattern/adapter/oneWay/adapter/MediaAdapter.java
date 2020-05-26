package com.hjc.structuralPattern.adapter.oneWay.adapter;

import com.hjc.structuralPattern.adapter.oneWay.target.MediaPlayer;
import com.hjc.structuralPattern.adapter.oneWay.adaptee.AdvanceMediaPlayer;
import com.hjc.structuralPattern.adapter.oneWay.adaptee.TecentMediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer = new TecentMediaPlayer();
    public MediaAdapter(){
    }

    @Override
    public void play(String type, String fileName) {
        if(type.equalsIgnoreCase("mp3")){
            advanceMediaPlayer.playAudio(fileName);
        }else if(type.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playVideo(fileName);
        }
    }
}
