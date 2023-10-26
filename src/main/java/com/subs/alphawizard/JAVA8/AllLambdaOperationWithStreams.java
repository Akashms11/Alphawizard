package com.subs.alphawizard.JAVA8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllLambdaOperationWithStreams {

    public static void main(String[] args) {
        //Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().filter(s->s%2==0).forEach(System.out::println);

        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().map(i->i.toString()).filter(i->i.startsWith("1")).forEach(System.out::println);


        //How to find duplicate elements in a given integers list in java using Stream functions?
        System.out.println("Duplicate elements in a list");
        List<Integer> duplicateList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        duplicateList.stream().filter(i->!set.add(i)).forEach(System.out::println);

        System.out.println("Find first element in a list");
        //Given the list of integers, find the first element of the list using Stream functions?
        duplicateList.stream().findFirst().ifPresent(System.out::println);

        //Given a list of integers, find the total number of elements present in the list using Stream functions?
        System.out.println("total number of elements present in the list");
        long count = duplicateList.stream().count();
        System.out.println(count);

        //Given a list of integers, find the maximum value element present in it using Stream functions?
        int max=duplicateList.stream().max(Integer::compare).get();
        System.out.println("Max->"+max);

        //Given a String, find the first non-repeated character in it using Stream functions?
        String s = "akash singh";
       char ch =  s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
                entrySet().stream().filter(p->p.getValue()==1).map(i->i.getKey()).findFirst().get();
        System.out.println("first non-repeated character->"+ch);

        //Given a String, find the first repeated character in it using Stream functions?
        String s2 = "asdfpjuioknmbkp";
        char  repeated= s2.chars().mapToObj(c->(char)c).
                collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet()
                .stream().filter(map->map.getValue()>1).map(map->map.getKey()).findFirst().get();
        System.out.println("first repeated character->"+repeated);

        //9. Given a list of integers, sort all the values present in it using Stream functions?
        List<Integer> unsorted = Arrays.asList(10,15,8,49,25,98,98,32,15);
        unsorted.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

       // 11. Given an integer array nums, return true if any value
        // appears at least twice in the array, and return false if every element is distinct.
        int nums[] = {1,2,3,1};
        List<Integer> boxed = Arrays.stream(nums).boxed().collect(Collectors.toList());
         Set<Integer> set1= new HashSet<>(list);
        if(set.size()!=boxed.size()){
            System.out.println("Present twice");
        }

        System.out.println("Current Local Date: " + java.time.LocalDate.now());
        //Used LocalDate API to get the date
        System.out.println("Current Local Time: " + java.time.LocalTime.now());
        //Used LocalTime API to get the time
        System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
        //Used LocalDateTime API to get both date and time

        //13. Write a Java 8 program to concatenate two Streams?
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        Stream<String> concatStream = Stream.concat(list1.stream(),list2.stream());
        concatStream.forEach(System.out::println);

        //Java 8 program to perform cube on list elements and filter numbers greater than 50.
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        System.out.println("perform cube on list elements and filter numbers greater than 50.");
        integerList.stream().map(i->i*i*i).filter(x->x>50).forEach(System.out::println);

        //15. Write a Java 8 program to sort an array
        // and then convert the sorted array into Stream?
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        Arrays.parallelSort(arr);
        Arrays.stream(arr).forEach(n->System.out.print(n+" "));

        //16. How to use map to convert object into Uppercase in Java 8?
        List<String> nameList = Arrays.asList("Akash","Singh","Malik");
        nameList.stream().map(String::toUpperCase).forEach(n->System.out.print(n+" "));

        //17. How to convert a List of objects into a Map by
        // considering duplicated keys and store them in sorted order?

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students(12,"Akash"));
        studentsList.add(new Students(1,"Zakash"));
        studentsList.add(new Students(16,"yAkash"));
        studentsList.add(new Students(4,"pAkash"));
        studentsList.add(new Students(20,"rAkash"));
        Map<String,Integer> mapLong = studentsList.stream().sorted(Comparator.comparing(Students::getMarks)).
                collect(Collectors.toMap(Students::getName,Students::getMarks,(oldValue, newValue) -> oldValue,LinkedHashMap::new));
        System.out.println(mapLong);

         //How to count each element/word from the String ArrayList in Java8?
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC","BB");
        Map<String,Long> maps = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("count each element-word from the String ArrayList in Java8");
        System.out.println(maps);

        // How to find only duplicate elements with its count from the String ArrayList in Java8?
        Map<String,Long> mapsd = names.stream().filter(x->Collections.frequency(names, x)>1).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
        Optional.ofNullable(studentsList)
                .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
                .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
                .map(note -> note.getName()) // method reference, consider only tag name
                .forEach(System.out::println); // it will print tag names

        //21. Write a Program to find the Maximum element in an array?
         Arrays.stream(nums).max().getAsInt();

         //Write a program to print the count of each character in a String?
        String eachCharacterInputString = "string data to count each character";
        eachCharacterInputString.chars().mapToObj(c->(char)c).collect(Collectors.
                groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(n->System.out.println(n.getKey()+"->"+n.getValue()));



    }
}
