package com.hjc.behavioralPattern.command;

import com.hjc.behavioralPattern.command.abstractionCommand.Command;
import com.hjc.behavioralPattern.command.concreteCommand.HelpCommand;
import com.hjc.behavioralPattern.command.concreteCommand.MinimizeCommand;
import com.hjc.behavioralPattern.command.invoker.FunctionButton;
import com.hjc.behavioralPattern.command.receiver.HelpHandler;
import com.hjc.behavioralPattern.command.receiver.WindowHandler;

public class Client {
    public static void main(String[] args) {
        FBSettingWindow window=new FBSettingWindow("功能键设置");
        FunctionButton button1,button2;
        Command command1,command2,command3,command4;

        button1=new FunctionButton("按键1");
        button2=new FunctionButton("按键2");


        command1=new HelpCommand(new HelpHandler());
        command2=new MinimizeCommand(new WindowHandler());

        button1.setCommand(command1);
        button2.setCommand(command2);

        window.add(button1);
        window.add(button2);
        window.display();

        button1.onClick();
        button2.onClick();


    }
}
