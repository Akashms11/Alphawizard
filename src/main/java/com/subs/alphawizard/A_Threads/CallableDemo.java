package com.subs.alphawizard.A_Threads;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> myCallable = new MyCallable();
        ExecutorService myExecutor = Executors.newSingleThreadExecutor();
        Future<Integer> future = myExecutor.submit(myCallable);
        Integer result = future.get(); //will be blocked until come back with results
    }
}
