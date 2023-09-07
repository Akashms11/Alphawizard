package com.subs.alphawizard.Mathematics;

import java.util.ArrayList;
import java.util.List;

public class TotalCombinationBrackets {
    static List<String> getCombo(int n, String openBracketType){
        List<String> result = new ArrayList<>();
        findCombo(openBracketType,1,0,result,n);
        return result;
    }
    static void findCombo(String current, int o,int c,List<String> result,int n){
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        if(o<n)findCombo(current+"{",o+1,c,result,n);
        if(c<o)findCombo(current+"}",o,c+1,result,n);
    }
    public static void main(String[] args) {
        int n = 5;
        List<String> combo = getCombo(n,"{");
        //combo.forEach(System.out::println);
        int count =0;
        for(String s : combo){
            System.out.println(s);
            count++;
        }
        System.out.println("Total Number of Count::::: "+count);
    }
}
