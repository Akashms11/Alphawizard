package com.subs.alphawizard.Mathematics;

public class NumberOfTrailingZeros {

    static int numberOfTrailingZeros(int n){
        int res = 0;
        for(int i=5; i<=n;i=i*5){
            res+=n/i;
        }
        return res;
    }
    public static void main(String ar[]){
        System.out.println("Number of trailing zeros in number "+numberOfTrailingZeros(12));
    }
}
