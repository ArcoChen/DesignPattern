package com.hjc.creativePattern.AbstractFactory.abstractFactory;

import com.hjc.creativePattern.AbstractFactory.abstractProduct.Button;
import com.hjc.creativePattern.AbstractFactory.abstractProduct.ComboBox;
import com.hjc.creativePattern.AbstractFactory.abstractProduct.TextField;

/**
 * 界面皮肤工厂接口：抽象工厂
 */
public interface SkinFactory {
    //界面皮肤工厂所包含的产品
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
