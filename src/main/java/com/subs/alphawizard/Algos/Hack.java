package com.subs.alphawizard.Algos;

public class Hack {
    final int data=20;

void method(){
    Runnable r = new Runnable() {
        final int data = 10;

        @Override
        public void run() {
            int data = 25;
            System.out.println(this.data);
        }

    };
}



    public static void main(String br[]){
        Hack hack = new Hack();
        Thread t = new Thread();
        t.start();
        hack.method();
    }
}
