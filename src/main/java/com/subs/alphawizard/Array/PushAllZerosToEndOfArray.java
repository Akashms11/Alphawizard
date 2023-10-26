package com.subs.alphawizard.Array;

public class PushAllZerosToEndOfArray {

    static void movesAllZerosToEnd(int[] arr,int n){
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[++index]=arr[i];
            }

        }
        for(int i=index+1;i<n;i++){
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,0,3, 5, 0, 0, 4,0,0};
        movesAllZerosToEnd(arr,arr.length);
        for(int x:arr){
            System.out.print(" "+x);
        }

    }
}
