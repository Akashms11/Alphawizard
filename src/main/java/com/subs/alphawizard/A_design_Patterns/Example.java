package com.subs.alphawizard.A_design_Patterns;

public class Example {


    static String getMatchingChars(String[] strArray){
        String ans="";
        boolean present=false;
        String task = strArray[0];
        for (int i=0;i<task.length();i++){
            for(int j=1;j<strArray.length;j++){
                if(task.charAt(i)==strArray[j].charAt(i)){
                    present=true;
                }
                else{
                    present=false;
                    break;
                }
            }
            if(present==true)
                ans+=task.charAt(i);
        }
     return ans;

    }

    public static void main(String[] args) {
        String[] s = {"flight","property","propane"};
        System.out.println("Matching Chars "+getMatchingChars(s));
    }
}
