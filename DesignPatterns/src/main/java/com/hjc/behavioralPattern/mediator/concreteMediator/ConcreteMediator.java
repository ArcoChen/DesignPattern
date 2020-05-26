package com.hjc.behavioralPattern.mediator.concreteMediator;

import com.hjc.behavioralPattern.mediator.colleague.AbstractComponent;
import com.hjc.behavioralPattern.mediator.concreteColleague.Button;
import com.hjc.behavioralPattern.mediator.concreteColleague.ComboBox;
import com.hjc.behavioralPattern.mediator.concreteColleague.ListBox;
import com.hjc.behavioralPattern.mediator.concreteColleague.TextBox;
import com.hjc.behavioralPattern.mediator.mediator.Mediator;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {
    //维持对各同事对象的引用
    public Button button;
    public ListBox listBox;
    public ComboBox comboBox;
    public TextBox textBox;

    @Override
    public void componentChanged(AbstractComponent abstractComponent) {
        if (abstractComponent == button) {
            System.out.println("点击增加按钮！");
            listBox.update();
            comboBox.update();
            textBox.update();
        } else if (abstractComponent == listBox) {
            System.out.println("从列表框选择客户");
            comboBox.select();
            textBox.setText();
        } else if (abstractComponent == comboBox) {
            System.out.println("从组合框选择客户");
            comboBox.select();
            textBox.setText();
        }
    }


}
