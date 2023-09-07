package com.subs.alphawizard.Mathematics;

public class ModuloAndFastPower {

    //n is the modulo 10^9+7
    static long fastPower(long a, long b, int n){
        long res =1;
        while (b>0){
            if((b&1) !=0){
                res = (res*a%n)%n;
            }
            a = (a%n * a%n)%n;
            b = b>>1;
        }
        return res;
    }

    static int fastPower(int a,int b){
        int res=1;
        while(b>0){
            if((b&1)!=0)
            {
                res = res*a;
            }
            a=a*a;
            b=b>>1;
        }
        return res;
    }

    public static void main(String ar[]){
        System.out.println("FastPower "+fastPower(12,4));
        System.out.println("FastPower with modulo "+fastPower(7896543,4,1000000007));
    }
}
