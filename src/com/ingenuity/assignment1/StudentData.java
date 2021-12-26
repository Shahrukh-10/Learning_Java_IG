package com.ingenuity.assignment1;


import java.util.Scanner;

class Student{
    private int rollNo;
    private String studName;
    private float percentage;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}

public class StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student obj1 = new Student();
        System.out.println("Enter Student name : ");
        obj1.setStudName(sc.nextLine());
        System.out.println("Enter RollNo : ");
        obj1.setRollNo(sc.nextInt());
        System.out.println("Enter percentage : ");
        obj1.setPercentage(sc.nextInt());
        sc.nextLine();

        Student obj2 = new Student();
        System.out.println("Enter Student name : ");
        obj2.setStudName(sc.nextLine());
        System.out.println("Enter RollNo : ");
        obj2.setRollNo(sc.nextInt());
        System.out.println("Enter percentage : ");
        obj2.setPercentage(sc.nextInt());
        sc.nextLine();

        Student obj5 = new Student();
        System.out.println("Enter Student name : ");
        obj5.setStudName(sc.nextLine());
        System.out.println("Enter RollNo : ");
        obj5.setRollNo(sc.nextInt());
        System.out.println("Enter percentage : ");
        obj5.setPercentage(sc.nextInt());
        sc.nextLine();

        Student obj3 = new Student();
        System.out.println("Enter Student name : ");
        obj3.setStudName(sc.nextLine());
        System.out.println("Enter RollNo : ");
        obj3.setRollNo(sc.nextInt());
        System.out.println("Enter percentage : ");
        obj3.setPercentage(sc.nextInt());
        sc.nextLine();

        Student obj4 = new Student();
        System.out.println("Enter Student name : ");
        obj4.setStudName(sc.nextLine());
        System.out.println("Enter RollNo : ");
        obj4.setRollNo(sc.nextInt());
        System.out.println("Enter percentage : ");
        obj4.setPercentage(sc.nextInt());
        sc.nextLine();



        System.out.println(obj2.getStudName() + " , " + obj2.getRollNo()+" , "+obj2.getPercentage());
        System.out.println(obj3.getStudName() + " , " + obj3.getRollNo()+" , "+obj3.getPercentage());
        System.out.println(obj4.getStudName() + " , " + obj4.getRollNo()+" , "+obj4.getPercentage());
        System.out.println(obj5.getStudName() + " , " + obj5.getRollNo()+" , "+obj5.getPercentage());
        System.out.println(obj1.getStudName() + " , " + obj1.getRollNo()+" , "+obj1.getPercentage());
    }

}

