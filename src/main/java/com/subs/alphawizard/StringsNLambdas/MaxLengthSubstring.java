package com.subs.alphawizard.StringsNLambdas;

import java.util.HashSet;
import java.util.Set;

public class MaxLengthSubstring {

    static int maxLen(String s){
        int maxLen = 0;
        Set<Character> visited = new HashSet<>();
        int left=0,right=0;
        while(right<s.length()){
            char ch = s.charAt(right);
            if(visited.add(ch)){
                maxLen = Math.max(maxLen,(right-left)+1);
                right++;
            }
            else{
                while(s.charAt(left)!=ch){
                    visited.remove(s.charAt(left));
                    left++;
                }
                visited.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
       String sh = "abyzkcabcdeflopabcd";
       System.out.println("Max Length is: "+maxLen(sh));
    }
}
