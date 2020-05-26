package com.hjc.behavioralPattern.visitor;

import com.hjc.behavioralPattern.visitor.concreteElement.FullTimeEmployee;
import com.hjc.behavioralPattern.visitor.concreteElement.PartTimeEmployee;
import com.hjc.behavioralPattern.visitor.concreteVisitor.FADepartment;
import com.hjc.behavioralPattern.visitor.concreteVisitor.HRDepartment;
import com.hjc.behavioralPattern.visitor.element.Employee;
import com.hjc.behavioralPattern.visitor.objectStructure.EmployeeList;
import com.hjc.behavioralPattern.visitor.visitor.Department;

public class Client {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        Employee luFei, naMei, suoLong, shanZhi;

        luFei = new FullTimeEmployee("路飞", 3200.00, 30);
        naMei = new FullTimeEmployee("娜美", 4000.00, 45);
        suoLong = new PartTimeEmployee("索隆", 100, 20);
        shanZhi = new PartTimeEmployee("山治", 80, 16);

        list.addEmployee(luFei);
        list.addEmployee(naMei);
        list.addEmployee(suoLong);
        list.addEmployee(shanZhi);

        Department department = new HRDepartment();
        list.accept(department);
    }
}
