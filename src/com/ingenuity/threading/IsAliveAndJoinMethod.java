package com.ingenuity.threading;

public class IsAliveAndJoinMethod implements Runnable {
    @Override
    public void run() {
        Thread th = Thread.currentThread();
        System.out.println(th.isAlive());
    }

    public static void main(String[] args) throws Exception {
        IsAliveAndJoinMethod it = new IsAliveAndJoinMethod();
        Thread th = new Thread(it);
        th.start(); //The isAlive() method of thread class tests if the thread is alive
        th.join(); //Thread class provides the join() method which allows one thread to wait until another thread completes its execution.

        System.out.println(th.isAlive());

    }
}
