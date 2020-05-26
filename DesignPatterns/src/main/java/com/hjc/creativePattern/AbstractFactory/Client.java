package com.hjc.creativePattern.AbstractFactory;

import com.hjc.creativePattern.AbstractFactory.concreteFactory.SpringSkinFactory;
import com.hjc.creativePattern.AbstractFactory.abstractProduct.Button;
import com.hjc.creativePattern.AbstractFactory.abstractProduct.ComboBox;
import com.hjc.creativePattern.AbstractFactory.abstractFactory.SkinFactory;
import com.hjc.creativePattern.AbstractFactory.abstractProduct.TextField;

public class Client {
    public static void main(String[] args) {
        SkinFactory factory;
        Button button;
        TextField textField;
        ComboBox comboBox;

        factory=new SpringSkinFactory();
        button=factory.createButton();
        textField=factory.createTextField();
        comboBox=factory.createComboBox();
    }
}
