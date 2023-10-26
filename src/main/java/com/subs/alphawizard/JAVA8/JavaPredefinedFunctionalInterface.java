package com.subs.alphawizard.JAVA8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaPredefinedFunctionalInterface {


    public static void main(String[] args) {
        //Consumer (java.util.function.Consumer):
        // Represents an operation that takes a single input and performs an action but doesn't return a result.
        Consumer<String> print = str->System.out.println(str);

       // Supplier (java.util.function.Supplier): Represents a supplier of results and has no input arguments.
        // It is used to provide values.
        Supplier<Integer> randomNumberSupplier = ()->(int)Math.random()*100;
        System.out.println(randomNumberSupplier.get());

        // Predicate (java.util.function.Predicate):
        // Represents a predicate (boolean-valued function) of one argument.
        Predicate<Integer> isEven = num->num%2==0;
        System.out.println(isEven.test(12));

        //Function (java.util.function.Function):
        // Represents a function that takes one argument and produces a result.
        Function<Integer, Integer> square = (num) -> num * num;
        System.out.println(square.apply(2));

    }
}
