package com.homework.oop.polymorphism.employee_main;

import com.homework.oop.polymorphism.employee.Employee;

public class Employee_main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(123, "Alex Hirshman", 2000 );

        System.out.println("Salary: "+ employee1.getSalary()+"$");
        System.out.println("Salary + bonus: "+ employee1.getSalary(1000)+ "$");
    }
}
