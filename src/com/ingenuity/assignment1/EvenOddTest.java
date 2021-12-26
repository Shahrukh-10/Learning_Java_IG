package com.ingenuity.assignment1;

import java.util.Scanner;

// Program 1;

class EvenOdd{
    private int num;
    private boolean evenOdd;

    public void setNum(int no){
        this.num = no;
    }
    public int getNum(){
        return num;
    }
    public void setEvenOdd(boolean b){
        this.evenOdd = b;
    }
    public boolean checkEvenOdd(){
        int k = this.getNum();
        if(k%2==0){
            return true;
        }
        return false;
    }
}

public class EvenOddTest {

    public static void main(String[] args) {

        EvenOdd obj = new EvenOdd() ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to check even odd ....");
        obj.setNum(sc.nextInt());
        obj.setEvenOdd(false);
        System.out.println(obj.checkEvenOdd());


    }
}
