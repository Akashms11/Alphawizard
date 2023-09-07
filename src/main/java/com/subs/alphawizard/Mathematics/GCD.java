package com.subs.alphawizard.Mathematics;

public class GCD {
    static int getGCD(int a, int b){
        if(b==0) return a;
        return getGCD(b,a%b);
    }

    public static void main(String ar[]){
        System.out.println("GCD "+getGCD(24,60));
    }
}
