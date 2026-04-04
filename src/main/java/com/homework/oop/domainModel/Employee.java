package com.homework.OOP.domainModel;

public class Employee {
    private static int id = 1;
    private int employeeId;
    private String name;
    private String position;
    private int salary;
    private String department;

    public Employee(String name, String position, int salary){
        employeeId = id ++;
        this.name = name;
        this.position = position;
        this.salary = salary;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
