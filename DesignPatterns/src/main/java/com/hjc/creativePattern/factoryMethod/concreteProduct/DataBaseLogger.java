package com.hjc.creativePattern.factoryMethod.concreteProduct;

import com.hjc.creativePattern.factoryMethod.abstractProduct.Logger;

/**
 * 数据库日志记录器：具体产品
 */
public class DataBaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
