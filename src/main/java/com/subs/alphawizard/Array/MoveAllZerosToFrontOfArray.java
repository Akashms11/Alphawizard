package com.subs.alphawizard.Array;

public class MoveAllZerosToFrontOfArray {


    public static void main(String[] args) {
        int arr[] = {0,1,0,3,2,0,6,7,0};
        movesAllZerosToFront(arr,arr.length);
        for(int x:arr){
            System.out.print(" "+x);
        }

    }

    private static void movesAllZerosToFront(int[] arr, int n) {
        int index=arr.length;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0)
                arr[--index]=arr[i];
        }
        for(int i=0;i<index;i++){
            arr[i]=0;
        }
    }
}
