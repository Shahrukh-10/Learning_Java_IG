package com.ingenuity.threading;

class FirstThread extends Thread{
    public void run(){
        System.out.println("Sharinagan (<>)");
    }
}
public class UsingThreadExample {
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        ft.start();
    }
}
