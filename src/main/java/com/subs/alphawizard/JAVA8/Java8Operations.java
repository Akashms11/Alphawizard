package com.subs.alphawizard.JAVA8;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Operations {


    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(200,"Akash"));
        students.add(new Students(100,"ZEE"));
        students.add(new Students(123,"LEE"));
        students.add(new Students(156,"SEE"));
        students.add(new Students(112,"BEE"));
        students.add(new Students(176,"Singh"));
        Collections.sort(students, (o1, o2) -> o1.getMarks()- o2.getMarks());
       List<String> stu =  students.stream().filter(students1 -> students1.getName().endsWith("E"))
                .map(s->s.getName()+" Appended").collect(Collectors.toList());
        long count = students.stream().filter(s->s.getName().contains("Appended"))
                .map(Students::getName).count();
        students.stream().map(s->s.getName().replaceAll("[E]","**")).forEach(System.out::println);
        System.out.println("Count: "+count);
        List<List<Integer>> flatMapExampleList = new ArrayList<>();
        List<Integer> l1 = Arrays.asList(6,1,4,5,9,7);
        List<Integer> l2= Arrays.asList(66,11,44,55,99,77);
        List<Integer> l3 = Arrays.asList(90,80,100,50,40,60);
        flatMapExampleList.add(l1);
        flatMapExampleList.add(l2);
        flatMapExampleList.add(l3);
        flatMapExampleList.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println("List generate by flatMap-"
                + flatMapExampleList);

        List<Integer> list = Arrays.asList(2,8,5,4,9);
        int secondLargest = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println("Second largest element in the list is "+secondLargest);
        int product = list.stream().reduce(1,(a,b)->a*b).intValue();
        System.out.println("Product of the list "+product);
    }
}
