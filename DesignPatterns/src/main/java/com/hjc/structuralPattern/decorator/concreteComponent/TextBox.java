package com.hjc.structuralPattern.decorator.concreteComponent;

import com.hjc.structuralPattern.decorator.component.Component;

public class TextBox extends Component {
    @Override
    public void display() {
        System.out.println("显示文本框");
    }
}
