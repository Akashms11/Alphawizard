package com.subs.alphawizard.StringsOps;

public class RomanToInteger {

    //Symbol       Value
    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000

    static int val(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    static int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if ((i + 1) < n && val(s.charAt(i)) < val(s.charAt(i + 1)))
                ans -= val(s.charAt(i));
            else
                ans += val(s.charAt(i));

        }
        return ans;
    }


    public static void main(String[] args) {
        String s1="EIK";
        String s2="EIK";
        String s3=new String("EIK");
        StringBuilder sb1 = new StringBuilder();
        sb1.append("EI").append("K");



        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);
        System.out.println(s2==s1);
    }
}
