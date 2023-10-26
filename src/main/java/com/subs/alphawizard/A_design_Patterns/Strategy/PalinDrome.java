package com.subs.alphawizard.A_design_Patterns.Strategy;

public class PalinDrome {

    static boolean isPalinDrome(String s){
        char [] ch = s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="racecar";
        System.out.println(isPalinDrome(s));


    }
}
