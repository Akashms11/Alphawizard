package com.subs.alphawizard.A_design_Patterns.Factory;

public class FactoryDemoMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new ShapeFactory();
        Shape s1 = shapeFactory.getShape("Circle");
        Shape s2 = shapeFactory.getShape("Square");
        Shape s3 = shapeFactory.getShape("Rectangle");
        s1.draw();
        s2.draw();
        s3.draw();
    }
}
