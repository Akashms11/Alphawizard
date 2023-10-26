package com.subs.alphawizard.JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateListElementsByJava8 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,2,3,4,8,3);
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().filter(s->s.getValue()>=2).map(e->e.getKey()).
                collect(Collectors.toList()).forEach(System.out::println);

        }
    }

