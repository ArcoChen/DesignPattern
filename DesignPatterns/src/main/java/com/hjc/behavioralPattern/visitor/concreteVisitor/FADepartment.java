package com.hjc.behavioralPattern.visitor.concreteVisitor;

import com.hjc.behavioralPattern.visitor.concreteElement.FullTimeEmployee;
import com.hjc.behavioralPattern.visitor.concreteElement.PartTimeEmployee;
import com.hjc.behavioralPattern.visitor.visitor.Department;

public class FADepartment extends Department {
    @Override
    public void visit(FullTimeEmployee fullTimeEmployee) {
        int workTime = fullTimeEmployee.getWorkTime();
        double weekWage = fullTimeEmployee.getWeeklyWage();
        if (workTime > 40) {
            weekWage = weekWage + (workTime - 40) * 100;
        } else if (workTime < 40) {
            weekWage = weekWage - (40 - workTime) * 80;
            if (weekWage < 0) {
                weekWage = 0;
            }
        }
        System.out.println("正式员工：" + fullTimeEmployee.getName() + "，实际工资为：" + weekWage);
    }

    @Override
    public void visit(PartTimeEmployee partTimeEmployee) {
        int workTime = partTimeEmployee.getWorkTime();
        double hourWage = partTimeEmployee.getHourWage();
        System.out.println("临时工:" + partTimeEmployee.getName() + ",实际工资为：" + hourWage * workTime);
    }
}
