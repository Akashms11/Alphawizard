package com.subs.alphawizard.Array;

import java.util.*;

public class FindDuplicateInAnArray {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
      ArrayList<Integer> list = new ArrayList<>();
      for(int i=0;i<n;i++){
          int index = arr[i]%n;
          arr[index]+=n;
      }
      for(int i=0;i<n;i++){
          if(arr[i]/n>=2){
              list.add(i);
          }
      }
      if(list.size()==0){
          list.add(-1);
          return list;
      }
      return list;

    }

    public static void main(String[] args) {
        int[] a = {3 ,4 ,12, 3, 12, 3, 4,4 ,12, 7, 11, 6, 5};
        System.out.println(duplicates(a,a.length));

    }
}
