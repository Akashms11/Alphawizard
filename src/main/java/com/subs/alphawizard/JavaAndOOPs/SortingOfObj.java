package com.subs.alphawizard.JavaAndOOPs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class SortingOfObj {
    public static void main(String ar[]){
        List<Students> students = new ArrayList<>();
        students.add(new Students(122,"manas"));
        students.add(new Students(100,"Anav"));
        students.add(new Students(200,"Sarukh"));
        students.add(new Students(154,"Zarina"));
        students.add(new Students(154,"Bill"));
        //Collections.sort(students);
        Collections.sort(students,new SortByNameThanMarks());
        //students.forEach((System.out::println));
        //with anonymous class
        Collections.sort(students, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if(o1.getName().equals(o2.getName())){
                    return o1.getMarks()-o2.getMarks();
                } else return o2.getName().compareTo(o1.getName());

            }
        });
        // with lambda
        Collections.sort(students, (o1, o2) -> {
            if(o1.getName().equals(o2.getName())){
                return o1.getMarks()-o2.getMarks();
            } else return o2.getName().compareTo(o1.getName());

        });
        //One Line
        Collections.sort(students,Comparator.comparing(Students::getName).thenComparing(Students::getMarks));
        students.forEach((System.out::println));
    }


}
