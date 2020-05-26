package com.hjc.creativePattern.AbstractFactory.concreteFactory;

import com.hjc.creativePattern.AbstractFactory.abstractProduct.Button;
import com.hjc.creativePattern.AbstractFactory.abstractProduct.ComboBox;
import com.hjc.creativePattern.AbstractFactory.abstractFactory.SkinFactory;
import com.hjc.creativePattern.AbstractFactory.abstractProduct.TextField;
import com.hjc.creativePattern.AbstractFactory.concreteProduct.SummerButton;
import com.hjc.creativePattern.AbstractFactory.concreteProduct.SummerComboBox;
import com.hjc.creativePattern.AbstractFactory.concreteProduct.SummerTextField;

/**
 * Summer皮肤共产：具体工厂
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
