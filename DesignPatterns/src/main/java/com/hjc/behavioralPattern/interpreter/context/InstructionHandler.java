package com.hjc.behavioralPattern.interpreter.context;

import com.hjc.behavioralPattern.interpreter.abstractExpression.AbstractNode;
import com.hjc.behavioralPattern.interpreter.nonTerminalExpression.AndNode;
import com.hjc.behavioralPattern.interpreter.nonTerminalExpression.SentenceNode;
import com.hjc.behavioralPattern.interpreter.terminalExpression.ActionNode;
import com.hjc.behavioralPattern.interpreter.terminalExpression.DirectionNode;
import com.hjc.behavioralPattern.interpreter.terminalExpression.DistanceNode;

import java.util.Stack;

/**
 * 指令处理类：工具类
 */
public class InstructionHandler {
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;

        //声明一个栈对象用于存储抽象语法树
        Stack<AbstractNode> stack = new Stack<>();

        //以空格分割指令字符串
        String[] words = instruction.split(" ");

        for (int i = 0; i < words.length; i++) {
            //本实例采用栈的方式来处理指令，如果遇到“and”，则将其后的三个单词作为三个终结符表达式
            if (words[i].equalsIgnoreCase("and")) {
                left = stack.pop();
                direction = new DirectionNode(words[++i]);
                action = new ActionNode(words[++i]);
                distance = new DistanceNode(words[++i]);

                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            } else {
                direction = new DirectionNode(words[i]);
                action = new ActionNode(words[++i]);
                distance = new DistanceNode(words[++i]);

                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        this.node = stack.pop();
    }

    public String output() {
        return node.interpret();
    }
}
