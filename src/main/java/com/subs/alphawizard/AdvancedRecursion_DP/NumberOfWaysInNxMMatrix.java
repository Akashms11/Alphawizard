package com.subs.alphawizard.AdvancedRecursion_DP;

public class NumberOfWaysInNxMMatrix {
    //To find the number of ways to reach the end in NxM Matrix
    static int numberOfWays(int n, int m){
        if(n==1 || m==1)
            return  1;
        return numberOfWays(n-1,m)+numberOfWays(n,m-1);
    }
    public static void main(String[] args) {
        System.out.println("Number of ways in 3 X 3 matrix: "+numberOfWays(3,3));
    }
}
