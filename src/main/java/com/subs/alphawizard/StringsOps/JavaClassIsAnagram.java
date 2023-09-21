package com.subs.alphawizard.StringsOps;

import java.util.Arrays;

public class JavaClassIsAnagram {
    static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length())
            return false;
         s1= s1.replaceAll("\\s","").toLowerCase();
        s2= s2.replaceAll("\\s","").toLowerCase();
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
    public static void main(String[] args) {
        String s1 = "Bad Credit";
        String s2 = "Debit Card";
        System.out.println(isAnagram(s1,s2));
    }
}
