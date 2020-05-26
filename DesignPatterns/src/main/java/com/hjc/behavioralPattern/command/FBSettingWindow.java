package com.hjc.behavioralPattern.command;

import com.hjc.behavioralPattern.command.invoker.FunctionButton;

import java.util.ArrayList;
import java.util.List;

public class FBSettingWindow {
    //窗口标题
    private String title;

    private List<FunctionButton> functionButtons =new ArrayList<FunctionButton>();

    public FBSettingWindow(String title){
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void add(FunctionButton functionButton) {
        functionButtons.add(functionButton);
    }

    public void remove(FunctionButton functionButton) {
        functionButtons.remove(functionButton);
    }

    public void display(){
        System.out.println("显示窗口："+title);
        System.out.println("显示功能键：");
        for(FunctionButton functionButton:functionButtons){
            System.out.println(functionButton.getName());
        }
        System.out.println("====================");
    }
}
