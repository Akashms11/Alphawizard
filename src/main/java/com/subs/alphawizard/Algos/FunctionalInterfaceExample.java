package com.subs.alphawizard.Algos;

interface MyInterface {
    default void defaultMethod() {
        System.out.println("I'm Default method");
    }
    default void defaultMethod1() {
        System.out.println("I'm Default method-1");
    }

     void regularMethod();
}

class MyClass implements MyInterface{


    @Override
    public void regularMethod() {
        System.out.println("I'm Regular method");
    }
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.regularMethod();
        myClass.defaultMethod();
        myClass.defaultMethod1();

    }
}
