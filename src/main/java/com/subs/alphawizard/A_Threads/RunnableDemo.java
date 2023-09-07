package com.subs.alphawizard.A_Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnableInterface myRunnable = new MyRunnableInterface();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(myRunnable);
    }

}
