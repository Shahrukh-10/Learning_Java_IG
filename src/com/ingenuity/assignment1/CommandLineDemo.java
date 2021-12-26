package com.ingenuity.assignment1;

public class CommandLineDemo {
    public static void main(String[] args) {
        int n = args.length;
        System.out.println("Length of command line args : "+ n );
        for(int i =0;i<n;i++){
            System.out.println(args[i]);
        }
   }
}

// // TODO this I have to do using diff methods