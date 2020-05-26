package com.hjc.behavioralPattern.mediator.concreteColleague;

import com.hjc.behavioralPattern.mediator.colleague.AbstractComponent;

public class ComboBox extends AbstractComponent {
    @Override
    public void update() {
        System.out.println("组合框增加一项：路飞");
    }

    public void select(){
        System.out.println("组合框选中一项：娜美");
    }
}
