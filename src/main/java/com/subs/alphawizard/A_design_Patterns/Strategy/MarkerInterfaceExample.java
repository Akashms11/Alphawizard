package com.subs.alphawizard.A_design_Patterns.Strategy;

// Marker interface for serializable classes
interface SerializableMarker {}

// A class that implements the SerializableMarker interface
class MySerializableClass implements SerializableMarker {
    private int data;

    public MySerializableClass(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}

public class MarkerInterfaceExample {
    public static void main(String[] args)
    {
        MySerializableClass myObject = new MySerializableClass(42);;
        // Check if the object implements the SerializableMarker interface

        if (myObject instanceof SerializableMarker) {
            System.out.println("myObject is serializable.");
        } else {
            System.out.println("myObject is not serializable.");
        }
    }
}
