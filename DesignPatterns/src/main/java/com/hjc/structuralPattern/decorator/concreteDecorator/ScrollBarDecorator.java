package com.hjc.structuralPattern.decorator.concreteDecorator;

import com.hjc.structuralPattern.decorator.component.Component;
import com.hjc.structuralPattern.decorator.decorator.ComponentDecorator;

public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void setScrollBar(){
        System.out.println("为构件增加滚动条");
    }

    public void display(){
        this.setScrollBar();
        super.display();
    }
}
