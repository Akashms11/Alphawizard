package com.subs.alphawizard.JavaAndOOPs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingOfEmployee {

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(100,"zkash","java"));
        emp.add(new Employee(15,"ykash","dJava"));
        emp.add(new Employee(25,"akash","uiava"));
        emp.add(new Employee(9,"skash","cZava"));
        emp.add(new Employee(12,"bakash","mjava"));
       Collections.sort(emp, Comparator.comparing(Employee::getSalary).
               thenComparing(Employee::getName).thenComparing(Employee::getDepartment));
        Collections.sort(emp, ( o1,  o2)-> {
                return o1.getSalary()-o2.getSalary();
            }
        );
        Collections.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        });
        emp.forEach(System.out::println);
    }
}
