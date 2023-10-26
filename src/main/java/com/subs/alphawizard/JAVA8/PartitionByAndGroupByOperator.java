package com.subs.alphawizard.JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByAndGroupByOperator {
    public static void main(String[] args) {
        //PartitioningBy
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<Boolean,List<Integer>> partitionedByEvenOdd =
                list.stream().collect(Collectors.partitioningBy(num->num%2==0));
        System.out.println("Even Number "+partitionedByEvenOdd.get(true));
        System.out.println("Odd Number "+partitionedByEvenOdd.get(false));

        //GroupingBy
        List<String> fruits = Arrays.asList("Mango","Apple","BlueBerry","RaspBerry","Cherry","Orange");
        Map<Integer,List<String>> groupingByKeyAndListLength =
                fruits.stream().collect(Collectors.groupingBy(String::length));
        groupingByKeyAndListLength.forEach((length,fruitList)->System.out.println("Length of fruit "+length+" fruitList"+fruitList));

    }
}
