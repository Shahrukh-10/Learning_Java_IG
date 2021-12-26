package com.ingenuity.assignment1;

import java.util.Scanner;

class Prime{
    private int number;

    private boolean check;

    public void setNumber(int number) {
        this.number = number;
    }

     public int getNumber() {
         return number;
     }

     public boolean isCheck() {
         return check;
     }

     public void checkPrime(){
        int k = getNumber();
        check = true;
         for (int i = 2; i <= getNumber()/2 ; i++) {
             if(k%i==0){
                 check = false;
                 break;
             }
         }
         if (k==0 || k==1){
             check = false;
         }
     }
 }

public class TestPrime {
    public static void main(String[] args) {
        Prime obj = new Prime();
        Scanner sc = new Scanner(System.in);
        obj.setNumber(sc.nextInt());
        obj.checkPrime();
        System.out.println(obj.isCheck());
    }
}
