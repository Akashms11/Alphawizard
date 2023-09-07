package com.subs.alphawizard.A_Threads;

import java.util.concurrent.*;

public class CachedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new MyRunnableInterface());
        Callable<Integer> integerCallable = new MyCallable();
        Future<Integer> integerFuture = executorService.submit(integerCallable);
        try {
            Integer result = integerFuture.get(); // This will block until the result is available
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            // Handle exceptions here
        }

    }
}
