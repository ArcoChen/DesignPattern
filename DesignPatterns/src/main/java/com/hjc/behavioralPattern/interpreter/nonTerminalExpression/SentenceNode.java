package com.hjc.behavioralPattern.interpreter.nonTerminalExpression;

import com.hjc.behavioralPattern.interpreter.abstractExpression.AbstractNode;

/**
 * 简答句子表达式：非终结符表达式
 */
public class SentenceNode extends AbstractNode {
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    //简单句子解释操作
    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
