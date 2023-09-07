package com.subs.alphawizard.A_Threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // Your code here, and you can return a result
        return 42;
    }
}
