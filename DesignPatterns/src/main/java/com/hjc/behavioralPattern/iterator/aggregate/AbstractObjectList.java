package com.hjc.behavioralPattern.iterator.aggregate;

import com.hjc.behavioralPattern.iterator.iterator.AbstractIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合类
 */
public abstract class AbstractObjectList {
    protected List<Object> objectList=new ArrayList<Object>();

    public List<Object> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public AbstractObjectList(List<Object> objects){
        this.objectList=objects;
    }

    //声明创建迭代器对象的抽象工厂方法
    public abstract AbstractIterator createIterator();
}
