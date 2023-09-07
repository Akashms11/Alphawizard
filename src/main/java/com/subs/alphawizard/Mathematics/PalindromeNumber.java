package com.subs.alphawizard.Mathematics;

import java.util.Scanner;

public class PalindromeNumber {

    static int reverse(int n){
        int res=0;
        while(n>0){
            res =res*10+n%10;
            n/=10;
        }
        return res;
    }
    static boolean isPalindrome(int a, int b){
        return a==b?true:false;
    }
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome");
        int n = sc.nextInt();
        int rev = reverse(n);
        System.out.println("palindrome Test::"+isPalindrome(n,rev));


    }
}
