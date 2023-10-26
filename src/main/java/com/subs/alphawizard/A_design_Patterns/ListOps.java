package com.subs.alphawizard.A_design_Patterns;

import java.util.*;
import java.util.stream.Collectors;

public class ListOps {
    public static void main(String[] args) {
       Map<String,List<String>> map = new HashMap<>();
       map.put("Akash", Arrays.asList("Singh","Malik"));
        map.put("Sam", Arrays.asList("Smith","Singh"));
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" ->"+m.getValue());
        }
       map.entrySet().stream().collect(Collectors.toList()).forEach(System.out::println);



    }
}
