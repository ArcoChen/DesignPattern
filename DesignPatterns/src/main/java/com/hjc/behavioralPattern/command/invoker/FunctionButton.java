package com.hjc.behavioralPattern.command.invoker;

import com.hjc.behavioralPattern.command.abstractionCommand.Command;

/**
 * 功能键类：请求发送者
 */
public class FunctionButton {
    private String name;
    private Command command;

    public FunctionButton(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick(){
        System.out.println("点击功能键：");
        command.execute();
    }
}
