package com.subs.alphawizard.JavaAndOOPs;

public class Employee {
    private int salary;
    private String name;
    private String department;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int salary, String name, String department) {
        this.salary = salary;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
