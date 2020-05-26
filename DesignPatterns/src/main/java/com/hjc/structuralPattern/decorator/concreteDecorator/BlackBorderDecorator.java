package com.hjc.structuralPattern.decorator.concreteDecorator;

import com.hjc.structuralPattern.decorator.component.Component;
import com.hjc.structuralPattern.decorator.decorator.ComponentDecorator;

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void setBlackBorder(){
        System.out.println("为构件增加黑色边框");
    }

    public void display(){
        this.setBlackBorder();
        super.display();
    }
}
