package com.subs.alphawizard.StringsOps;

class Solution {
    static int titleToNumber(String columnTitle) {
        int sum=0;
        double p=1;
        int j=1;
        for(int i=columnTitle.length()-1;i>=0;i--){
            int value = ((int)columnTitle.charAt(i)-64)*(int)p;
            sum+=value;
             p=Math.pow(26,j);
            j++;

        }
        return sum;
    }

    static int titleToNumber1(String columnTitle) {
        int sum=0;

        for(int i=0;i<columnTitle.length();i++){

          sum= sum*26 +((int)columnTitle.charAt(i)-'A'+1);
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "ZY";
        System.out.println(titleToNumber1(s));
    }
}