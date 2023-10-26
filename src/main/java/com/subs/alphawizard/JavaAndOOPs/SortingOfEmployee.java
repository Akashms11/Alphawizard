package com.subs.alphawizard.JavaAndOOPs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        emp.stream().map(Employee::getSalary).filter(num->num>100).collect(Collectors.toList()).forEach(System.out::println);
    }
}
