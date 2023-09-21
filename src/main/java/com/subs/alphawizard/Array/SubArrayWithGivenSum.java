package com.subs.alphawizard.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArrayWithGivenSum {

    static List<Integer> subarraySum(int[] arr, int sum)
    {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<>();
        int currSum=0;
        int startIndex=0;
        int endIndex=-1;

        for(int i=0;i<arr.length;i++){
          currSum+=arr[i];
          if(currSum-sum==0){
              startIndex=0;
              endIndex=i;
              break;
          }
          if (map.containsKey(currSum-sum)){
              startIndex=map.get(currSum-sum)+1;
              endIndex=i;
              break;
          }
          map.put(currSum,i);
        }
        if (endIndex==-1){
            list.add(-1);
        }
        else{
            list.add(startIndex+1);
            list.add(endIndex+1);
        }
        return list;

    }
    public static void main(String[] args) {
        int[] arr = {1 ,2, 3, 7, 5};
        System.out.println("Array with given sum"+subarraySum(arr,12));

    }
}
