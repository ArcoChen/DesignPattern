package com.hjc.behavioralPattern.iterator;

import com.hjc.behavioralPattern.iterator.aggregate.AbstractObjectList;
import com.hjc.behavioralPattern.iterator.concreteAggregate.ProductList;
import com.hjc.behavioralPattern.iterator.iterator.AbstractIterator;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Object> products = new ArrayList<Object>();
        products.add("路飞");
        products.add("娜美");
        products.add("索隆");
        products.add("山治");

        AbstractObjectList list;
        AbstractIterator iterator;

        list = new ProductList(products);//创建聚合类
        iterator = list.createIterator();//创建迭代对象

        System.out.println("正向遍历：");
        while (!iterator.isLast()) {
            System.out.println(iterator.getNextItem() + "，");
            iterator.next();
        }
        System.out.println("-----------------------------");

        System.out.println("逆向遍历：");
        while (!iterator.isFirst()) {
            System.out.println(iterator.getPreviousItem() + "，");
            iterator.previous();
        }

        System.out.println("=======================");
        //通过JDK内置的迭代器遍历聚合对象中的元素
        Collection persons = new ArrayList();
        persons.add("路飞");
        persons.add("娜美");
        persons.add("索隆");
        persons.add("山治");

        process(persons);
    }

    private static void process(Collection c) {
        //创建迭代器对象
        Iterator i = c.iterator();

        // 通过迭代器遍历聚合对象
        while (i.hasNext()) {
            System.out.println(i.next().toString());
        }
    }
}
