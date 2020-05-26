package com.hjc.behavioralPattern.visitor.element;

import com.hjc.behavioralPattern.visitor.visitor.Department;

/**
 * 员工类：抽象元素类
 */
public interface Employee {
    //接受一个抽象访问者访问
    public void accept(Department handler);
}
