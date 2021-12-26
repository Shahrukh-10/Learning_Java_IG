package com.ingenuity.threadSynchronization;

public class Transaction {
    public static void main(String[] args) {

    Account obj = new Account(123);
    obj.setBalance(1000);
    MyThread t1 = new MyThread(obj,900);
    MyThread t2 = new MyThread(obj,500);
    Thread mt1 = new Thread(t1);
    Thread mt2 = new Thread(t2);
    mt1.setName("T1");
    mt2.setName("T2");
    mt1.start();
    mt2.start();
    }
}
