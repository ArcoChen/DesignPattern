package com.hjc.behavioralPattern.visitor.objectStructure;

import com.hjc.behavioralPattern.visitor.element.Employee;
import com.hjc.behavioralPattern.visitor.visitor.Department;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    //定义一个集合用于存储员工对象
    private List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    public void remove(Employee employee) {
        list.remove(employee);
    }

    //遍历访问员工集合的每一个员工对象
    public void accept(Department handler) {
        for (Employee employee : list) {
            employee.accept(handler);
        }
    }
}
