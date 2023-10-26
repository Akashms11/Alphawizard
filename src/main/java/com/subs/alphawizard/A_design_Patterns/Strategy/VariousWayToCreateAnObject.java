package com.subs.alphawizard.A_design_Patterns.Strategy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class VariousWayToCreateAnObject implements Cloneable{

    //Using Static Initialization Blocks:
    //You can create objects with static initialization blocks, but this is less common.


    static {
        int x=10;
        // Initialization logic
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        //new KeyWord
        VariousWayToCreateAnObject x= new VariousWayToCreateAnObject();
        //You can create a copy of an existing object using the clone()
        // method, but the class must implement the Cloneable interface and override the clone method properly.
        VariousWayToCreateAnObject clone = (VariousWayToCreateAnObject) x.clone();


        //Using Deserialization:
        //You can create objects by deserializing data from a file or stream using Java's Object Input/Output Streams.
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"))) {
            VariousWayToCreateAnObject myObject = (VariousWayToCreateAnObject) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Using Reflection:
        //Java Reflection allows you to create objects dynamically at
        // runtime by inspecting classes and invoking their constructors.
        try {
            Class<?> clazz = Class.forName("com.example.MyClass");
            VariousWayToCreateAnObject myObject = (VariousWayToCreateAnObject) clazz.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException
                 | InvocationTargetException e) {
            e.printStackTrace();
        }

        //Using Enum Constants:
        //If you have an enum type, you can create objects by accessing the enum constants.
        MyEnum myEnum = MyEnum.TUESDAY;

        //Using Lambda Expressions and Anonymous Classes:
        //You can create objects with anonymous classes or lambda expressions when
        // working with interfaces and functional programming.
        Runnable myRunnable = () -> System.out.println("Running...");
        Map<Integer,Integer> map = new HashMap<>();
    }
}

enum MyEnum{
    SUNDAY,MONDAY,TUESDAY
}
