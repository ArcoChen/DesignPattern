package com.hjc.behavioralPattern.command.commandQueue;

/**
 * 在增加了命令队列类CommandQueue以后，请求发送者类Invoker将针对CommandQueue编程，
 */
public class InvokerWIthCommandQueue {
    private CommandQueue commandQueue;

    //构造注入
    public InvokerWIthCommandQueue(CommandQueue commandQueue){
        this.commandQueue=commandQueue;
    }

    //设值注入
    public CommandQueue getCommandQueue() {
        return commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void execute(){
        commandQueue.execute();
    }
}
