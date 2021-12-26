package com.ingenuity.arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Iterator;
public class Array_ArrayBlockingQueue {
    public static void main(String[] args) {
        int n = 5 ;
        ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(n);
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.peek());
        Iterator i = q.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
