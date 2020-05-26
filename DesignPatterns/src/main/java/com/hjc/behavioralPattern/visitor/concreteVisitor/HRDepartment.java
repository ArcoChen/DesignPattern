package com.hjc.behavioralPattern.visitor.concreteVisitor;

import com.hjc.behavioralPattern.visitor.concreteElement.FullTimeEmployee;
import com.hjc.behavioralPattern.visitor.concreteElement.PartTimeEmployee;
import com.hjc.behavioralPattern.visitor.visitor.Department;

/**
 * 人力资源部：具体访问者类
 */
public class HRDepartment extends Department {
    @Override
    public void visit(FullTimeEmployee fullTimeEmployee) {
        int workTime = fullTimeEmployee.getWorkTime();
        System.out.println("正式员工:" + fullTimeEmployee.getName() + "，实际工作时间为：" +fullTimeEmployee.getWorkTime());
    if (workTime > 40) {
            System.out.println("正式员工:" + fullTimeEmployee.getName() + "，加班时间为："+(workTime-40));
        } else if (workTime < 40) {
            System.out.println("正式员工:" + fullTimeEmployee.getName() + "，请假时间为：" +(40-workTime));
        }
    }

    @Override
    public void visit(PartTimeEmployee partTimeEmployee) {
        int workTime = partTimeEmployee.getWorkTime();
        System.out.println("临时员工:" + partTimeEmployee.getName() + "，实际工作时间为：" +partTimeEmployee.getWorkTime());
    }
}
