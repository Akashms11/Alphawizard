package com.subs.alphawizard.BuyAndsell;

public class BuyNSell1 {

    static int maxProfitReq(int a[]){
        //O(1) space and O(n) time
        int maxProfit = 0;
        int minSoFar = a[0];
        for(int i=0; i<a.length;i++){
            minSoFar = Math.min(minSoFar,a[i]);
            maxProfit = Math.max(a[i]-minSoFar, maxProfit);
        }
        return maxProfit;
    }

    static int maxProfit(int a[]){
        //O(n) space and time
        int aux[] = new int[a.length];
        int maxSoFar = a[a.length-1];
        aux[a.length-1] = maxSoFar;
        for(int i=a.length-2;i>=0;i--){
            aux[i] = Math.max(a[i],maxSoFar);
            maxSoFar = aux[i];
        }
        int maxProfit =0;
        for (int i=0;i<a.length;i++){
            maxProfit = Math.max((aux[i]-a[i]),maxProfit);
        }
        return maxProfit;
    }

    public static void main(String ar[]){
       int a[] = {3,1,4,8,7,2,5};
       System.out.println("Maximum profit on buy n sell:: "+maxProfit(a));
        System.out.println("Maximum profit on buy n sell O(n),O(1):: "+maxProfitReq(a));
    }
}
