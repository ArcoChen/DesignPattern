package com.hjc.behavioralPattern.command.concreteCommand;

import com.hjc.behavioralPattern.command.abstractionCommand.Command;
import com.hjc.behavioralPattern.command.receiver.HelpHandler;

/**
 * 帮助命令类：具体命令类
 */
public class HelpCommand extends Command {
    private HelpHandler helpHandler;

    public HelpCommand(HelpHandler helpHandler){
        this.helpHandler=helpHandler;
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}
