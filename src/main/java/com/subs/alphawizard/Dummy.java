package com.subs.alphawizard;

import java.util.Arrays;
import java.util.List;

public class Dummy {

    public static void main(String[] args) {
//        for(int i=3;i<=100;i++){
//            int flag=0;
//            for(int j=2;j<i/2;j++){
//                if(i%j==0){
//                    flag=1;
//                }
//            }
//            if(flag==0)
//                System.out.println(i+" is Prime");
//            else
//                System.out.println(i+" is not Prime");
//        }
        List<String> list = Arrays.asList("abc","baa","xyz","pqrs", "xyz", "abc");
        list.stream().map(s->s.replaceAll("[a]","")).forEach(System.out::println);

    }
}
