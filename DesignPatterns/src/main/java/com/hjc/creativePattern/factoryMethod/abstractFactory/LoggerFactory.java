package com.hjc.creativePattern.factoryMethod.abstractFactory;

import com.hjc.creativePattern.factoryMethod.abstractProduct.Logger;

/**
 * 日志记录器工厂接口：抽象工厂
 */
public interface LoggerFactory {

    Logger createLogger();

}
