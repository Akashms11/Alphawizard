package com.subs.alphawizard.AdvancedRecursion_DP;

public class BasicRecursionOperation {

    static int sum(int n){
        if(n==1)
            return 1;
        return n+sum(n-1);
    }
    static int power(int a,int b){
        if(b==0)
            return 1;
        else return a*power(a,b-1);
    }
    public static void main(String[] args) {
        System.out.println("Sum of n natural numbers :: "+sum(10));
        System.out.println("Power function :: "+power(3,4));
    }
}
