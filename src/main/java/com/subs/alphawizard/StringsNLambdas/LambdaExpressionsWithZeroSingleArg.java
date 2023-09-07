package com.subs.alphawizard.StringsNLambdas;
//There are three Lambda Expression Parameters are mentioned below:
//
//        Zero Parameter
//        Single Parameter
//        Multiple Parameters
//        1. Lambda Expression with Zero parameter
//        () -> System.out.println("Zero parameter lambda");
//        2. Lambda Expression with Single parameter
//        (p) -> System.out.println("One parameter: " + p);
//        It is not mandatory to use parentheses if the type of that variable can be inferred from the context

import java.util.ArrayList;

public class LambdaExpressionsWithZeroSingleArg {
    public static void main(String ar[]){
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        //arrL.forEach(n->System.out.println(n));
        arrL.forEach(n->{
            if(n%2==0)
            System.out.println(n);
        });
       // that lambda expressions can only be used to
        // implement functional interfaces. In the above example also,
        // the lambda expression implements Consumer Functional Interface.

    }
}
