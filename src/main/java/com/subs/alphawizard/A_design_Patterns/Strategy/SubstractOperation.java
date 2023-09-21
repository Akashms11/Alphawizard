package com.subs.alphawizard.A_design_Patterns.Strategy;

public class SubstractOperation implements Strategy{
    @Override
    public int doOperation(int x, int y) {
        return x-y;
    }
}
