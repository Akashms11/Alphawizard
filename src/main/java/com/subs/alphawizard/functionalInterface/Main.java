package com.subs.alphawizard.functionalInterface;

public class Main {
    public static void main(String[] args) {
        // Using lambda expression to implement the functional interface
        MyFunctionalInterface myFunction = () -> System.out.println("Doing something!");

        // Calling the abstract method using the lambda expression
        myFunction.doSomething();

        // Using a method reference to implement the functional interface
        MyFunctionalInterface myFunctionRef = Main::printSomething;
        MyFunctionalInterface myFunctionalInterface = Main::printSomethingMore;
        myFunctionalInterface.doSomething();
        myFunctionRef = myFunctionalInterface;
        // Calling the abstract method using the method reference
        myFunctionRef.doSomething();
    }

    public static void printSomething() {
        System.out.println("Printing something!");
    }
    public static void printSomethingMore() {
        System.out.println("Printing something more..!");
    }
}

