package com.hjc.behavioralPattern.visitor.concreteElement;

import com.hjc.behavioralPattern.visitor.element.Employee;
import com.hjc.behavioralPattern.visitor.visitor.Department;

public class FullTimeEmployee implements Employee {
    private String name;
    private double weeklyWage;
    private int workTime;

    public FullTimeEmployee(String name, double weeklyWage, int workTime) {
        this.name = name;
        this.weeklyWage = weeklyWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeeklyWage() {
        return weeklyWage;
    }

    public void setWeeklyWage(double weeklyWage) {
        this.weeklyWage = weeklyWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(Department handler) {
        //调用访问者的访问方法
        handler.visit(this);
    }
}
