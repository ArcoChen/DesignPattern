package com.hjc.creativePattern.factoryMethod;

import com.hjc.creativePattern.factoryMethod.concreteFactory.DatabaseLoggerFactory;
import com.hjc.creativePattern.factoryMethod.concreteFactory.FileLoggerFactory;
import com.hjc.creativePattern.factoryMethod.abstractProduct.Logger;
import com.hjc.creativePattern.factoryMethod.abstractFactory.LoggerFactory;

public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        //实例化文件日志工厂
        factory=new FileLoggerFactory();
        //创建文件日志对象
        logger=factory.createLogger();
        logger.writeLog();

        factory=new DatabaseLoggerFactory();
        logger=factory.createLogger();
        logger.writeLog();
    }

}
