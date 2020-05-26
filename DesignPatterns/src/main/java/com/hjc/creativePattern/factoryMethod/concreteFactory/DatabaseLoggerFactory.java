package com.hjc.creativePattern.factoryMethod.concreteFactory;

import com.hjc.creativePattern.factoryMethod.abstractProduct.Logger;
import com.hjc.creativePattern.factoryMethod.abstractFactory.LoggerFactory;
import com.hjc.creativePattern.factoryMethod.concreteProduct.DataBaseLogger;

/**
 * 数据库日志记录器工厂类：具体工厂
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //连接数据库，代码略
        //创建数据库日志记录器对象
        Logger logger=new DataBaseLogger();
        //初始化数据库日志记录器，代码略
        return logger;
    }
}
