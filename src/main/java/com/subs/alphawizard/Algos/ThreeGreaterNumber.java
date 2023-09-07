package com.subs.alphawizard.Algos;

import java.util.PriorityQueue;

public class ThreeGreaterNumber {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(pq.peek()<nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }

        return pq.peek();

    }

    static void threeBigNumber(int ar[]){
        int first= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        int third= Integer.MIN_VALUE;
        for (int a :ar){
            if(a>first){
                third=second;
                second=first;
                first=a;
            } else if (a>second) {
                third=second;
                second=a;
            }
            else if (a>third){
                third=a;
            }
        }
        System.out.println("First Big "+first+" Second big "+second+" Third big "+third);
    }

    public static void main(String[] args) {
        int arr[] = {7,2,1,4,18,23,1,90,61,21};
        threeBigNumber(arr);
    }
}
