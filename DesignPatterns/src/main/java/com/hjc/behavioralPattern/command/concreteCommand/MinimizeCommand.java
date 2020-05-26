package com.hjc.behavioralPattern.command.concreteCommand;

import com.hjc.behavioralPattern.command.abstractionCommand.Command;
import com.hjc.behavioralPattern.command.receiver.WindowHandler;

/**
 * 最小化命令类：具体命令类
 */
public class MinimizeCommand extends Command {
    private WindowHandler windowHandler;

    public MinimizeCommand(WindowHandler windowHandler) {
        this.windowHandler = windowHandler;
    }

    @Override
    public void execute() {
        windowHandler.minimize();
    }
}
