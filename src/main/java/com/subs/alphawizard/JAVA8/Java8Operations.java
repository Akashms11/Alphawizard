package com.subs.alphawizard.JAVA8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Operations {


    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(200,"Akash"));
        students.add(new Students(100,"ZEE"));
        students.add(new Students(123,"LEE"));
        students.add(new Students(156,"SEE"));
        students.add(new Students(112,"BEE"));
        students.add(new Students(176,"Singh"));
       List<String> stu =  students.stream().filter(students1 -> students1.getName().endsWith("E"))
                .map(s->s.getName()+" Appended").collect(Collectors.toList());
        long count = students.stream().filter(s->s.getName().contains("Appended"))
                .map(Students::getName).count();
        System.out.println("Count: "+count);
    }
}
