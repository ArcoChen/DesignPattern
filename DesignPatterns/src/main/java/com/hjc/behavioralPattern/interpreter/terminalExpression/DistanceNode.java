package com.hjc.behavioralPattern.interpreter.terminalExpression;

import com.hjc.behavioralPattern.interpreter.abstractExpression.AbstractNode;

/**
 * 距离解释：终结符表达式
 */
public class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    //距离表达式的解释操作
    public String interpret() {
        System.out.println(this.distance);
        return this.distance;
    }
}
