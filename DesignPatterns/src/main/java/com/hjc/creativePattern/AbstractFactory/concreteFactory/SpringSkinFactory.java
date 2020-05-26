package com.hjc.creativePattern.AbstractFactory.concreteFactory;

import com.hjc.creativePattern.AbstractFactory.abstractProduct.Button;
import com.hjc.creativePattern.AbstractFactory.abstractProduct.ComboBox;
import com.hjc.creativePattern.AbstractFactory.abstractFactory.SkinFactory;
import com.hjc.creativePattern.AbstractFactory.abstractProduct.TextField;
import com.hjc.creativePattern.AbstractFactory.concreteProduct.SpringButton;
import com.hjc.creativePattern.AbstractFactory.concreteProduct.SpringTextField;
import com.hjc.creativePattern.AbstractFactory.concreteProduct.SummerComboBox;

/**
 * Spring皮肤工厂：具体工厂
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
