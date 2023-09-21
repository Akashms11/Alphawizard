package com.subs.alphawizard.A_design_Patterns.Strategy;

public class MultiplyOperation implements Strategy{
    @Override
    public int doOperation(int x, int y) {
        return x*y;
    }
}
