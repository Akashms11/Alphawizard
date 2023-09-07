package com.subs.alphawizard.AA_Practice;

public class AreaOfRectangle {

    public static String ArrayChallenge(String[] strArr) {
        int[] xValues = new int[4];
        int[] yValues = new int[4];
        for(int i=0;i<strArr.length;i++){
            String[] co_ordinates = strArr[i].replaceAll("[()]","").split(" ");
            xValues[i] = Integer.parseInt(co_ordinates[0]);
            yValues[i] = Integer.parseInt(co_ordinates[1]);
        }
        int width = Math.abs(xValues[1]-xValues[0]);
        int height= Math.abs(yValues[2]-yValues[0]);
        return String.valueOf(width*height);
    }
    public static void main(String[] args) {
        String[] strArr = {"(0 0)", "(3 0)", "(0 2)", "(3 2)"};
        System.out.println(ArrayChallenge(strArr));
    }
}
