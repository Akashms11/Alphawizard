package com.subs.alphawizard.A_design_Patterns.Strategy;

public class LinkedListOperation {

    static void traverse(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print("->"+curr.data);
            curr=curr.next;
        }
    }

    //        Node<Integer> n1 = new Node<>(1);
//        Node<Integer> n2 = new Node<>(3);
//        Node<Integer> n3 = new Node<>(7);
//        Node<Integer> n4 = new Node<>(4);
//        Node<Integer> n5 = new Node<>(2);
//        Node head = n1;
//        n1.next = n2;
//        n2.next= n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = null;
//        traverse(head);

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            for(int i=0;i<=5;i++){
                System.out.println("First Thread is Running..");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<=5;i++){
                System.out.println("Second Thread is Running..");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();




    }
}
