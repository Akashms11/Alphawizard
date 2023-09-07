package com.subs.alphawizard.SetOperations;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    //Distinct Elements in an array
    //Union of Two Array
    static Set<Integer> union(int a[],int[]b){
        Set<Integer> set = new HashSet<>();
        for(int x:a){
            set.add(x);
        }
        for(int x:b){
            set.add(x);
        }
        return set;
    }
    static Set<Integer> Intersection(int a[],int[]b){
        Set<Integer> set = new HashSet<>();
        for(int x:a){
            set.add(x);
        }
        Set<Integer> I = new HashSet<>();
        for(int x:b){
            if(set.contains(x)) {
              I.add(x);
            }
        }
        return I;
    }
    //Intersection of two Arrays
    public static void main(String args[]){
        int arr[] = {1,3,5,7,9};
        int brr[] = {2,4,6,8,10,5,3,1};
        int dis[] = {1,2,1,3,5,3,6,2,4,8,1,4};
        Set<Integer> set = new HashSet<>();
        for(int a:dis){
            set.add(a);
        }
        System.out.println("Number of distinct elements are "+set.size());
        System.out.println("Union of two arrays are "+union(arr,brr));
        System.out.println("Intersection of two arrays are "+Intersection(arr,brr));
    }
}
