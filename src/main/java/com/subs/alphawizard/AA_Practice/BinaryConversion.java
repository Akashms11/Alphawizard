package com.subs.alphawizard.AA_Practice;

public class BinaryConversion {

    static  String getMagicString(String str){
       byte[] byteString = str.getBytes();
       int n = byteString.length;
       for(int i=0;i<n/2;i++){
           byte temp = byteString[i];
           byteString[i]=byteString[n-i-1];
           byteString[n-i-1]=temp;
       }
       return new String(byteString);
    }

    public static void main(String[] args) {
       System.out.println("String after converting byte Stream and Converting back to String is: "+getMagicString("123"));
    }
}
