package com.hjc.behavioralPattern.iterator.concreteIterator;

import com.hjc.behavioralPattern.iterator.aggregate.AbstractObjectList;
import com.hjc.behavioralPattern.iterator.concreteAggregate.ProductList;
import com.hjc.behavioralPattern.iterator.iterator.AbstractIterator;

import java.util.List;

public class ProductIterator implements AbstractIterator {
    private ProductList productList;

    private List products;

    //定义一个游标，用于记录正向遍历的位置
    private int right;

    //定义一个游标，用于记录逆向遍历的位置
    private int reverse;


    public ProductIterator(ProductList productList) {
        this.productList = productList;

        //获取集合对象
        this.products = productList.getObjectList();

        //设置正向遍历游标的初始值
        right = 0;

        //设置逆向遍历游标的初始值
        reverse = products.size() - 1;
    }

    public boolean isFirst() {
        return reverse == -1;
    }

    public boolean isLast() {
        return right == products.size();
    }

    public void previous() {
        if (reverse > -1) {
            reverse--;
        }
    }

    public void next() {
        if (right < products.size()) {
            right++;
        }
    }

    public Object getPreviousItem() {
        return products.get(reverse);
    }

    public Object getNextItem() {
        return products.get(right);
    }
}
