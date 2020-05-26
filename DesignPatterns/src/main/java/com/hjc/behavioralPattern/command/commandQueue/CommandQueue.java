package com.hjc.behavioralPattern.command.commandQueue;

import com.hjc.behavioralPattern.command.abstractionCommand.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * 有时候我们需要将多个请求排队，当一个请求发送者发送一个请求时，将不止一个请求接收者产生响应，
 * 这些请求接收者将逐个执行业务方法，完成对请求的处理。此时，我们可以通 过命令队列来实现。
 *
 * 命令队列的实现方法有多种形式，其中最常用、灵活性最好的一种方式是增加一个 CommandQueue类，
 * 由该类来负责存储多个命令对象，而不同的命令对象可以对应不同的请求 接收者
 */
public class CommandQueue {
    //存储命令对象
    private List<Command> commands=new ArrayList<Command>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void remove(Command command){
        commands.remove(command);
    }

    public void execute(){
        for(Command command:commands){
            command.execute();
        }
    }


}
