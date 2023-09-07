package com.subs.alphawizard.Mathematics;

import java.util.Arrays;

public class SeiveOfEratoSthenes {
    static boolean[] seiveForPrime(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2; i*i<=n;i++){
            for(int j=i*2;j<=n;j+=i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
    public static void main(String ar[]){
        boolean isPrime[] = seiveForPrime(50);
        for(int i=0;i<isPrime.length;i++){
            System.out.println(i+" "+isPrime[i]);
        }
        for(int i=0;i<isPrime.length;i++){
            if (isPrime[i]){
                System.out.print(i+"\t");
            }
        }

    }
}
