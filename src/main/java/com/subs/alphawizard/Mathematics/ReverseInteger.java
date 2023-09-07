package com.subs.alphawizard.Mathematics;

public class ReverseInteger {

    static int reverse(int x) {
//        if(x<0){
//            x=-x;
//        }
     int rev =0;
     while(x>0){
         rev = rev*10+(x%10);
         x/=10;
     }
     return rev;
    }
    public static void main(String[] args) {
        int n =-123;
        int b = reverse(n);
        System.out.println(b);

    }
}
