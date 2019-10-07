package com.k8101.lambda;

public class FilterEmployeeForSalary implements MyPredicate<Employee>{
    public boolean test(Employee employee) {
        return employee.getSalary()>=5000;
    }
}
