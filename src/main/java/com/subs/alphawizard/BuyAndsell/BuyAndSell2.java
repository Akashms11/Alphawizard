package com.subs.alphawizard.BuyAndsell;

public class BuyAndSell2 {

    static int maxProfit(int arr[]){
        int maxProfit = 0;
        for(int i=1; i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                maxProfit+=(arr[i]-arr[i-1]);
            }
        }
        return maxProfit;
    }

    public static void main(String ar[]){
        //int a[] = {5,2,7,3,6,1,2,4};
        int a[] = {5,2,7,1,-1,1,2,4};
        System.out.println("Maximum profit on buy n sell:: "+maxProfit(a));
    }
}
