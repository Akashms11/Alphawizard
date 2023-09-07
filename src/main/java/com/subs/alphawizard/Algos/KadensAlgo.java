package com.subs.alphawizard.Algos;

public class KadensAlgo {

    static int kdAlgoMaxSumSubArray(int a[]){
        int currSum = 0;
        int maxSum = 0;
        for(int i=0;i<a.length;i++){
          currSum+=a[i];
          if(currSum>maxSum){
              maxSum=currSum;
          }
          if(currSum<0){
              currSum = 0;
          }
        }
       // System.out.println("Min Index: "+currIndex+" Max index "+maxIndex);
        return maxSum;
    }

    public static void main(String [] akash){
        int a[] = {-5,4,6,-3,4,-1};
        System.out.println("Max Sum SubArray "+kdAlgoMaxSumSubArray(a));
    }
}
