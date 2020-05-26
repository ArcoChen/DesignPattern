package com.hjc.behavioralPattern.mediator;

import com.hjc.behavioralPattern.mediator.concreteColleague.Button;
import com.hjc.behavioralPattern.mediator.concreteColleague.ComboBox;
import com.hjc.behavioralPattern.mediator.concreteColleague.ListBox;
import com.hjc.behavioralPattern.mediator.concreteColleague.TextBox;
import com.hjc.behavioralPattern.mediator.concreteMediator.ConcreteMediator;
import com.hjc.behavioralPattern.mediator.mediator.Mediator;

public class Client {
    public static void main(String[] args) {
        //定义中介者对象
        ConcreteMediator mediator = new ConcreteMediator();

        //定义同事对象
        Button button = new Button();
        ListBox listBox = new ListBox();
        ComboBox comboBox = new ComboBox();
        TextBox textBox = new TextBox();

        button.setMediator(mediator);
        listBox.setMediator(mediator);
        comboBox.setMediator(mediator);
        textBox.setMediator(mediator);

        mediator.button=button;
        mediator.listBox=listBox;
        mediator.comboBox=comboBox;
        mediator.textBox=textBox;

        button.changed();
        System.out.println("-------------");
        listBox.changed();

    }
}
