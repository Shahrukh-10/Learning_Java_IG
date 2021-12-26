package com.ingenuity.threading;

class SimpleThread implements Runnable{
    public void run(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Thread using runnable interface ....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class UsingRunnableInterface {
    public static void main(String[] args) {
        SimpleThread st = new SimpleThread();
        Thread obj = new Thread(st);
        obj.start();
    }
}
