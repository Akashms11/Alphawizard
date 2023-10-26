package com.subs.alphawizard.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonElementInThreeArrays {


    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int x: A){
            list.add(x);
        }
        for(int x:B){
            if(list.contains(x)){
                set.add(x);
            }
        }
        for (int x:C){
            if(list.contains(x)&&set.contains(x)){
                
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int n1 = 6; int[] A = {1, 5, 10, 20, 40, 80};
        int n2 = 5; int[] B = {6, 7, 20, 80, 100};
        int n3 = 8; int [] C = {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println("Common Elements: "+commonElements(A,B,C,n1,n2,n3));
    }
}
