package com.hjc.structuralPattern.adapter.oneWay;

import com.hjc.structuralPattern.adapter.oneWay.adapter.MediaAdapter;
import com.hjc.structuralPattern.adapter.oneWay.target.MediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer=new MediaAdapter();

        mediaPlayer.play("mp3","风起来的时光");
        mediaPlayer.play("mp4","大话西游");

    }
}
