package com.subs.alphawizard.AdvancedRecursion_DP;

import java.util.Scanner;
//Recursive approach to print Fibonacci series
public class FibonacciRecursion {

    static int fibonacci(int n){
        if(n<=1)
            return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range number: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
          System.out.print(" "+fibonacci(i));
        }
    }
}
