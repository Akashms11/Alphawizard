package com.subs.alphawizard.AdvancedRecursion_DP;


// WAP to print all power-set of a given string
public class PrintAllPowerSetOfAGivenString {
    static void powerSet(String s, int i,String curr){
        if(i==s.length()){
            System.out.print(" "+curr);
            return;
        }
         powerSet(s,i+1,curr+s.charAt(i));
         powerSet(s,i+1,curr);
    }
    public static void main(String[] args) {
      String s ="abc";
        System.out.println("All power set of the given String are:: ");
        powerSet(s,0,"");

    }
}
