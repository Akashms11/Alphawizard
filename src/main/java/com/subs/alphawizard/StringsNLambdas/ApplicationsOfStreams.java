package com.subs.alphawizard.StringsNLambdas;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ApplicationsOfStreams {


//  Intermediate Operation	Description
//    filter	The filter method allows us to get elements of the stream that meet certain conditions.
//    distinct	The distinct method returns distinct elements of the stream.
//    limit	The limit method returns elements of the stream with the given number or limit.
//    map	The map method allows us to map elements of one stream to elements of another stream.
//    sorted	Returns elements of the stream in a given order.
    public interface MyFunctionalInterface{
        int mathOps(int x, int y);
    }
    public interface MyFunctionalInterface2{
        int mathOps(int x);
    }
    public static void main(String args[]){
        MyFunctionalInterface add = (int x,int y)->x+y;
        System.out.println("Addition of Numbers "+add.mathOps(5,6));
        MyFunctionalInterface multiply = (int x,int y)->x*y;
        System.out.println("product of Numbers "+multiply.mathOps(5,6));
        List<String> list = new ArrayList<>();
        list.add("b1");
        list.add("a1");
        list.add("c3");
        list.add("c1");
        list.add("b2");
        list.add("c2");
        list.stream().filter(s->s.startsWith("c")).map(String::toUpperCase).sorted()
                .forEach(System.out::println);
    }
}
