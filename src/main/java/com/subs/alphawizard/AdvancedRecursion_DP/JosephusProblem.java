package com.subs.alphawizard.AdvancedRecursion_DP;

public class JosephusProblem {

    static int alive(int n, int k){
        if(n==1)
            return 0;
        return (alive(n-1,k)+k)%n;
    }

    public static void main(String[] args) {
     System.out.println("If n=5 and k =3 then the alive person is:: "+alive(5,3));
    }
}
