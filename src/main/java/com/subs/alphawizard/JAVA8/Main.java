package com.subs.alphawizard.JAVA8;

interface I1 {
    default void display() {
        System.out.println("Display from I1");
    }
}

interface I2 {
    default void display() {
        System.out.println("Display from I2");
    }
}

class MyClass implements I1, I2 {
    // Implement the common default method
    @Override
    public void display() {
        I1.super.display(); // Call the method from I1
    }
}

class MyClass1 implements I1, I2 {
    // Resolve ambiguity by providing an implementation
    @Override
    public void display() {
        System.out.println("Display in MyClass");
    }
}


public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        MyClass1 ob = new MyClass1();
        ob.display();
        obj.display();
    }
}
