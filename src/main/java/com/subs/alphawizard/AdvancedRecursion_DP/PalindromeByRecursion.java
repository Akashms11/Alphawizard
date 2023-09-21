package com.subs.alphawizard.AdvancedRecursion_DP;

public class PalindromeByRecursion {
    static boolean isPalindrome(String s,int l,int r){
        if(l>=r)
            return true;
        if(s.charAt(l)!=s.charAt(r))
            return false;
        return isPalindrome(s,l+1,r-1);
            

    }
    public static void main(String[] args) {
        String s = "xy";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
