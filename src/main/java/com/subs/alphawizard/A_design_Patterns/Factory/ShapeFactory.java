package com.subs.alphawizard.A_design_Patterns.Factory;

public class ShapeFactory {
    public Shape getShape(String type){
        if(type==null){
            return null;
        } else if (type.equalsIgnoreCase("Circle")) {
           return new Circle();
        }
        else if (type.equalsIgnoreCase("Square")) {
            return new Square();
        }
        else if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}
