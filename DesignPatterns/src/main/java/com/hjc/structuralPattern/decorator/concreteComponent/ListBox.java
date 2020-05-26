package com.hjc.structuralPattern.decorator.concreteComponent;

import com.hjc.structuralPattern.decorator.component.Component;

public class ListBox extends Component {
    @Override
    public void display() {
        System.out.println("显示列表框");
    }
}
