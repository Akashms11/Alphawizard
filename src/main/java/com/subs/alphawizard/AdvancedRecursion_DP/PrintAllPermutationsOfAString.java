package com.subs.alphawizard.AdvancedRecursion_DP;

public class PrintAllPermutationsOfAString {

    static String swap(String s, int l,int r) {
        char[] charArray = s.toCharArray();
            char temp = charArray[l];
            charArray[l]=charArray[r];
            charArray[r]=temp;
            return String.valueOf(charArray);


    }
    static void permute(String s, int l,int r){
        if(l==r){
            System.out.println(s);
            return;
        }
        for(int i=l;i<=r;i++){
            s=swap(s,l,i);
            permute(s,l+1,r);
            s=swap(s,l,i);
        }

    }

    public static void main(String[] args) {
        String s = "abc";
        permute(s,0,s.length()-1);
    }
}
