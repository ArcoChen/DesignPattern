package com.hjc.behavioralPattern.mediator.concreteColleague;

import com.hjc.behavioralPattern.mediator.colleague.AbstractComponent;

public class TextBox extends AbstractComponent {
    @Override
    public void update() {
        System.out.println("客户信息增加成功后文本框清空");
    }

    public void setText(){
        System.out.println("文本框显示：娜美");
    }
}
