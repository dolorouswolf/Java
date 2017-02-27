/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package junior;

/**
 * Created by rodney on 20/02/2017.
 */

import java.io.*;
import java.util.HashMap;

public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployee() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Salary:" + salary);
    }

    public static void main(String[] args) {
        Employee  employee = new Employee();
        employee.setAge(28);
        employee.setDesignation("des");
        employee.setName("zm");
        employee.setSalary(35000);

        employee.printEmployee();

    }
}
