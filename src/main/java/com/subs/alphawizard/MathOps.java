package com.subs.alphawizard;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathOps {

    public static void main(String[] ar) {
        long[] data = {126934252l,123428581l,250773943l,250836130l,250787637l,122870601l};
        List<BigInteger> list = new ArrayList<BigInteger>(data.length);
        for (long num : data)
            list.add(BigInteger.valueOf(num));

        BigInteger sum = new BigInteger("0");
        for(int i=0;i<list.size();i++){
            sum=sum.add(list.get(i));
        }
        System.out.println("Average is:: " + sum.divide(BigInteger.valueOf(list.size())));
    }
}
