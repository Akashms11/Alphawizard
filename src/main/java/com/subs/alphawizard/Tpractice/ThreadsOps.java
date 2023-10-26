package com.subs.alphawizard.Tpractice;


import java.util.concurrent.*;

class MyRunnable implements Runnable{
    public void run(){
        for (int i = 0;i<3;i++){
            System.out.println("Thread1 is calling..."+Thread.currentThread());
        }
    }
}

class MyCallable implements Callable<Integer>{
    public Integer call() throws Exception{
        return 20;
    }
}
public class ThreadsOps {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService exe = Executors.newFixedThreadPool(10);
        MyCallable myc = new MyCallable();
        Future<Integer> resutf = exe.submit(myc);
        System.out.println(resutf.get());

        MyRunnable my = new MyRunnable();
        exe.submit(my);

        Thread t1 = new Thread(()->{
            System.out.println("Thread bbbb is running");
        });
        t1.start();



    }
}
