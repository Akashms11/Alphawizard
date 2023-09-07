package com.subs.alphawizard.StringsOps;

public class HeyStacknNeddle {
    static int check(String heystack, String niddle){
        for(int i=0;i<heystack.length()-niddle.length()+1;i++){
            if(heystack.charAt(i)==niddle.charAt(0)){
                if(heystack.substring(i,niddle.length()+i).equals(niddle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String heystack ="leetcode";
        String niddle = "leeto";
        if(check(heystack,niddle)!=-1){
            System.out.println("Found");
        } else{
            System.out.println("Not Found");
        }

    }
}
