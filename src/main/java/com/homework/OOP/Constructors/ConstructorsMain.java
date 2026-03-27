package com.homework.OOP.Constructors;


import com.homework.OOP.domainModel.Employee;

import java.util.Date;

import static java.lang.Math.*;

public class ConstructorsMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Lina", "QA", 1000);
        Employee employee2 = new Employee("Alex", "QA", 1000);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
