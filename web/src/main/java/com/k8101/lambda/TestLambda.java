package com.k8101.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLambda {


    List<Employee> employees = Arrays.asList(
            new Employee(1,"张三",18,9999.99),
            new Employee(2,"李四",38,5555.99),
            new Employee(3,"王五",56,6666.66),
            new Employee(4,"赵六",36,3333.33),
            new Employee(5,"田七",8,7777.77)
    );
    //需求，获取当前公司中员工年龄大于35的员工信息
    @Test
    public void test3(){
        List<Employee> list = filterEmployee(employees);
        for (Employee employee :list){
            System.out.println(employee);
        }

    }
    public List<Employee>filterEmployee(List<Employee>list){
        List<Employee>emps = new ArrayList<>();
        for (Employee emp :list){
            if (emp.getAge()>=35){
                emps.add(emp);
            }
        }
        return emps;
    }

    //需求：获取当前公司中员工工资大于5000的员工信息
    public List<Employee>filterEmployee2(List<Employee>list){
        List<Employee>emps = new ArrayList<>();
        for (Employee emp :list){
            if (emp.getSalary()>=5000){
                emps.add(emp);
            }
        }
        return emps;
    }

    //优化方式二：匿名内部类
    public void test03(){
        MyPredicate pr = new MyPredicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
    }


}
