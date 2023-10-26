package com.subs.alphawizard.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumEasy {

    static int [] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] a = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                a[0]=map.get(target-nums[i])+1;
                a[1]=i+1;
            }
            map.put(nums[i],i);
        }
        return a;

       }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int a[] = twoSum(nums,target);
        System.out.println(a[0]+" -->"+a[1]);

    }
}
