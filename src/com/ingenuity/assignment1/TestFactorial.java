package com.ingenuity.assignment1;

import java.util.Scanner;

class Factorial{
    private int no;
    private int fact;

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public int getFact() {
        return fact;
    }
    public void calFact(){
        int k = 1;
        for (int i = 1; i < getNo() ; i++) {
            k = k*i;
        }
        fact = k;
    }
}
public class TestFactorial {
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter factorial no ....");
        obj.setNo(sc.nextInt());
        obj.calFact();
        System.out.println("Answer is : "+ obj.getFact());
    }
}
