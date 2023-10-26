package com.subs.alphawizard.StringsOps;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChars {

    static void printNONRepeatedChars(String s){
        for (int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==i && s.lastIndexOf(s.charAt(i))==i){
                System.out.print(s.charAt(i)+ " ");
            }
        }
    }

    public static void main(String[] args) {
        String s = "american express private limited";
        printNONRepeatedChars(s);
        Map<String,String> map = new HashMap<>();
        map.put(new String("x"),"y");
        System.out.println(map.get("x"));
        String s2="A";
        String s1=new String("A");

    }
}
