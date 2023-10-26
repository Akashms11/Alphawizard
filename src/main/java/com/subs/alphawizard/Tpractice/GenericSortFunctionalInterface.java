package com.subs.alphawizard.Tpractice;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

interface myFunctionalInterface<T>{
    public void sortFunction(List<T> list, Comparator<T> comparator);
}

public class GenericSortFunctionalInterface {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(78,43,90,1,6,2,70);
        myFunctionalInterface myInteggersort = (l,c)->l.sort(c);
        myInteggersort.sortFunction(integerList,Comparator.naturalOrder());
        System.out.println("My Sorted IntegerList is "+integerList);
    }
}
