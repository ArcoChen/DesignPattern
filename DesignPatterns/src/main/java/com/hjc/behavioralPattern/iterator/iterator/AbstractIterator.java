package com.hjc.behavioralPattern.iterator.iterator;

public interface AbstractIterator {
    //判断是否为首个元素
    boolean isFirst();

    //判断是否为最后一个元素
    boolean isLast();

    void previous();//移至上一个元素

    //移至下一个元素
    void next();

    //获取上一个元素
    Object getPreviousItem();

    //获取下一个元素
    Object getNextItem();
}
