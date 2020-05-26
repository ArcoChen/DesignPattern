package com.hjc.creativePattern.factoryMethod.concreteProduct;

import com.hjc.creativePattern.factoryMethod.abstractProduct.Logger;

public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
