package com.subs.alphawizard.A_SingleTon;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    static Integer maxSize=5;
    static Map<Character,Character> integerCharacterLinkedHashMap = new LinkedHashMap<>(maxSize);


    static void put(char key,char value){

        if(integerCharacterLinkedHashMap.containsKey(key)){
            integerCharacterLinkedHashMap.remove(key);
            integerCharacterLinkedHashMap.put(key,value);
        }
        else if(integerCharacterLinkedHashMap.size()==maxSize){
                for (Map.Entry<Character,Character> map: integerCharacterLinkedHashMap.entrySet())
                {
                    integerCharacterLinkedHashMap.remove(map.getKey());
                    break;
                }
                integerCharacterLinkedHashMap.put(key, value);
        }
        else
            integerCharacterLinkedHashMap.put(key,value);

    }

    static Character get(char key){
        if(integerCharacterLinkedHashMap.containsKey(key))
            return integerCharacterLinkedHashMap.get(key);
        return null;
    }





    public static void main(String[] args) {
        //Map<Integer,Character> integerCharacterLinkedHashMap = new LinkedHashMap<>();
        System.out.println(integerCharacterLinkedHashMap.size());
        char ch ='a';
        for(char i='a';i<='f';i++){
            put(ch,i);
            ch++;
        }
        System.out.println(integerCharacterLinkedHashMap);

    }
}
