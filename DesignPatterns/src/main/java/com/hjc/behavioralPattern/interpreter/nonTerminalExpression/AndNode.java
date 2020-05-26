package com.hjc.behavioralPattern.interpreter.nonTerminalExpression;

import com.hjc.behavioralPattern.interpreter.abstractExpression.AbstractNode;

/**
 * And解释：非终结符表达式
 */
public class AndNode extends AbstractNode {
    //And的左表达式
    private AbstractNode left;
    //And的右表达式
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    //And的表达式操作
    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
