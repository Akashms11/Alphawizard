package com.subs.alphawizard.BitMasking;

import java.util.BitSet;

public class BitManipulation {

    static int oneDistinctNumberInTwiceSequence(int a[]){
        int res = 0;
        for(int i=0;i<a.length;i++){
            res^=a[i];
        }
        return res;
    }

    static int getIThBit(int n,int pos){
        int mask = 1<<pos;
        n = n&mask;
        return n;
    }
    static int setIThBit(int n,int pos){
        int mask = 1<<pos;
        n = n|mask;
        return n;
    }
    static int clearIThBit(int n,int pos){
        int mask = 1<<pos;
        mask = ~mask;
        n = n&mask;
        return n;
    }

    static int noOfOneInBinaryNumber(int n){
        int count =0;
       while(n!=0){
           count++;
           n = n&(n-1);
       }
        return count;
    }

    static boolean evenOdd(int n){
        return (n&1)==0?true:false;
    }

    public static void main(String ar[]){
        int a[] ={1,2,3,2,1,5,4,3,4,};
        System.out.println("CVheck Number+"+evenOdd(6));
        System.out.println("Distinct Number is .."+oneDistinctNumberInTwiceSequence(a));
        System.out.println("noOfOneInBinaryNumber Number is .."+noOfOneInBinaryNumber(13));
        System.out.println("getIthBit Number is .."+getIThBit(13,3));
    }
}
