package com.hjc.creativePattern.prototype.PrototypeManager;

/**
 * 抽象公文接口，也可以定义为抽象类，提供clone()方法的实现，将业务方法声明为抽象方法
 */
public interface OfficialDocument extends Cloneable {
    OfficialDocument clone();
    void display();
}
