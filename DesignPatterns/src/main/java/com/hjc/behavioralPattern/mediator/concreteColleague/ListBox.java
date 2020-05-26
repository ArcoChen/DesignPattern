package com.hjc.behavioralPattern.mediator.concreteColleague;

import com.hjc.behavioralPattern.mediator.colleague.AbstractComponent;

public class ListBox extends AbstractComponent {
    @Override
    public void update() {
        System.out.println("列表框增加一项：路飞");
    }

    public void select(){
        System.out.println("列表框选中一项：娜美");
    }
}
