package com.subs.alphawizard.A_design_Patterns.Strategy;

public class Example1 {

    static int missingNumer(int arr[],int range){
        int arraySum=0;
        for(int i=1;i<arr.length;i++){
         arraySum+=arr[i];
        }
        int actualSum = (range*(range+1))/2;
        return actualSum-arraySum;
    }

    public static void main(String[] args) {


    }
}
