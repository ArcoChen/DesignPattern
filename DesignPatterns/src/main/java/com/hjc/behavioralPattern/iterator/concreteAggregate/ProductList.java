package com.hjc.behavioralPattern.iterator.concreteAggregate;

import com.hjc.behavioralPattern.iterator.aggregate.AbstractObjectList;
import com.hjc.behavioralPattern.iterator.concreteIterator.ProductIterator;
import com.hjc.behavioralPattern.iterator.iterator.AbstractIterator;

import java.util.List;

/**
 * 商品数据类：具体聚合类
 */
public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> objects){
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
