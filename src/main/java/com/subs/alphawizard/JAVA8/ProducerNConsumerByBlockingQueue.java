package com.subs.alphawizard.JAVA8;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerNConsumerByBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread producerQueue = new Thread(new Producer(queue));
        Thread consumerQueue = new Thread(new Consumer(queue));
        producerQueue.start();
        consumerQueue.start();
    }
}

class Producer implements Runnable{
    BlockingQueue<Integer> queue;
    public Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    public void run(){
        for (int i=0;i<10;i++){
            try {
                queue.put(i);
                System.out.println("Produced.."+i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class Consumer implements Runnable{
    public Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    BlockingQueue<Integer> queue;
    public void run(){
        for (int i=0;i<10;i++){
            try {
                int j = queue.take();
                System.out.println("Consumed.."+j);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}