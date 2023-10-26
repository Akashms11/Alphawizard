package com.subs.alphawizard.A_Threads;

import com.subs.alphawizard.Algos.Hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findNonDub {
    static List<Character> getNonrepeatingCharacter(String s){
        List<Character> list = new ArrayList<>();
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }


        }
        for(Map.Entry m: map.entrySet()){
           if(map.get(m.getKey())==1){
               list.add((char)m.getKey());
           }


        }
        return list;
    }

    public static void main(String akash[]){
        String s ="qwertwy";
        System.out.println(getNonrepeatingCharacter(s));
    }
}
