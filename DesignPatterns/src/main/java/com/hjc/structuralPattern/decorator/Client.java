package com.hjc.structuralPattern.decorator;

import com.hjc.structuralPattern.decorator.component.Component;
import com.hjc.structuralPattern.decorator.concreteComponent.Window;
import com.hjc.structuralPattern.decorator.concreteDecorator.BlackBorderDecorator;
import com.hjc.structuralPattern.decorator.concreteDecorator.ScrollBarDecorator;

public class Client {
    public static void main(String[] args) {
        Component component,component1,component2;
        component=new Window();

        component1=new ScrollBarDecorator(component);
        component1.display();

        component2=new BlackBorderDecorator(component);
        component2.display();
    }
}
