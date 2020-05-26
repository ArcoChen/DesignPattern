package com.hjc.behavioralPattern.visitor.visitor;

import com.hjc.behavioralPattern.visitor.concreteElement.FullTimeEmployee;
import com.hjc.behavioralPattern.visitor.concreteElement.PartTimeEmployee;

/**
 * 部门类：抽象访问者
 */
public abstract class Department {
    public abstract void visit(FullTimeEmployee fullTimeEmployee);

    public abstract void visit(PartTimeEmployee partTimeEmployee);
}
