package com.hjc.structuralPattern.decorator.decorator;

import com.hjc.structuralPattern.decorator.component.Component;

public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component){
        this.component=component;
    }

    @Override
    public void display() {
        component.display();
    }
}
