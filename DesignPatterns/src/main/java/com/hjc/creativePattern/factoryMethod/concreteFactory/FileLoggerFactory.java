package com.hjc.creativePattern.factoryMethod.concreteFactory;


import com.hjc.creativePattern.factoryMethod.abstractProduct.Logger;
import com.hjc.creativePattern.factoryMethod.abstractFactory.LoggerFactory;
import com.hjc.creativePattern.factoryMethod.concreteProduct.FileLogger;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger=new FileLogger();
        //创建文件，代码略
        return logger;
    }
}
