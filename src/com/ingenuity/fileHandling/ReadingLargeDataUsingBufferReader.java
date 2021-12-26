package com.ingenuity.fileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingLargeDataUsingBufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter all the text u want to print");
        System.out.println("Write \"STOP\" to stop.");
        do{
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("STOP"));
    }
}
