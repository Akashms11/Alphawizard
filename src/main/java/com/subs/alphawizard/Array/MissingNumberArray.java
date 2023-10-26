package com.subs.alphawizard.Array;

public class MissingNumberArray {
    static int missingNumber(int array[], int n) {
        int sum=0;
        int max=array[0];
        for(int i=0;i<n;i++){
            sum+=array[i];
            if(array[i]>max)
                max=array[i];
        }
        int maxSum=(max*(max+1))/2;
        return maxSum-sum;
    }

    public static void main(String[] args) {
        int A[] = {6,1,2,8,3,4,7,10,5};
        System.out.println(missingNumber(A,A.length));
    }
}
