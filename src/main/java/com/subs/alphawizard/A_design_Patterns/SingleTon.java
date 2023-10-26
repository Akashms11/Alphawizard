package com.subs.alphawizard.A_design_Patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleTon {

    public static void main(String[] args) {

        String a = "First";
        String b = "Second";
        int l=a.length();
         a=a+b;
         b=a.substring(0,l);
         a=a.substring(l,a.length());
         System.out.println(a+"->"+b);
        String s ="Hello World";
        //OUTPUT : {"h": 1, "e": 1, "l": 3, "o": 2, "w": 1, "r":1, "d": 1}
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))){
               map.put(s.charAt(i),map.get(s.charAt(i))+1);
           }
           else{
               map.put(s.charAt(i),1);
           }
        }
        map.entrySet().stream().collect(Collectors.toList()).forEach(System.out::println);


    }
}
