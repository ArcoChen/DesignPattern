package com.hjc.structuralPattern.proxy.cglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer=new Enhancer();

    public  Object getProxy(Class clazz){
        //设置创建子类的类，为每个类产生代理类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);
        //创建子类的实例并返回
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("火车开始行驶....");
        methodProxy.invokeSuper(o,objects);
        System.out.println("火车结束行驶.....");
        return null;
    }
}
