package com.hjc.behavioralPattern.interpreter;

import com.hjc.behavioralPattern.interpreter.context.InstructionHandler;

public class Client {
    public static void main(String[] args) {
        String instruction = "down run 10 and right run 10";
        InstructionHandler iHandler = new InstructionHandler();
        iHandler.handle(instruction);

        String outString = iHandler.output();
        System.out.println(outString);
    }
}
