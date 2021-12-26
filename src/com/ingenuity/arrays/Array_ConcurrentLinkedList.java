package com.ingenuity.arrays;
import java.util.concurrent.*;

public class Array_ConcurrentLinkedList {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.size());
    }
}
