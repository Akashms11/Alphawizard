package com.subs.alphawizard.Algos;

//A program to get min number of coin to reach a target value

import java.util.Arrays;
import java.util.Scanner;

public class MinTargetCoin {

    static int minCoin(int [] coins, int target) {
        int [] dp = new int[target + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= target; i++) {
            for (int coin : coins)
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
        }
        return dp[target]==Integer.MAX_VALUE?-1:dp[target];
    }

    public static void main(String[] args) {
        int [] coins = {1,2,5,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target to get min number of coins: ");
        int target = sc.nextInt();
        System.out.println(minCoin(coins,target)+" is the min required coins to reach the target = "+target);

    }
}
