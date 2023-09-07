package com.subs.alphawizard.Algos;

public class Sort {
    static void sort(int a[]){
        int n= a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array is: ");
        for(int x:a){
            System.out.print(x+" ");
        }
    }
    public static void main(String brgs[]){
        int arr[] = {20,10,5,8,90};
        sort(arr);
    }
}
