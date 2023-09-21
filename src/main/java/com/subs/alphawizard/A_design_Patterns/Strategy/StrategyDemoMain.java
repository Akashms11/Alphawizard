package com.subs.alphawizard.A_design_Patterns.Strategy;

public class StrategyDemoMain {
    public static void main(String[] args) {
        Context c1 = new Context(new AddOperation());
        Context c2 = new Context(new SubstractOperation());
        Context c3 = new Context(new MultiplyOperation());
        System.out.println("3+5="+c1.executeOperation(3,5));
        System.out.println("5-3="+c2.executeOperation(5,3));
        System.out.println("5*3="+c3.executeOperation(5,3));
    }


}
