package com.ingenuity.assignment1;

import java.util.Scanner;

class Students{
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

public class StudentsDataUsingArray {
    private Students[] arr = new Students[5];
    public void addStudent(){
        Scanner sc = new Scanner(System.in);

        Students obj1 = new Students();
        System.out.println("Enter Student name : ");
        obj1.setStudName(sc.nextLine());
        System.out.println("Enter RollNo : ");
        obj1.setRollNo(sc.nextInt());
        System.out.println("Enter percentage : ");
        obj1.setPercentage(sc.nextInt());
        sc.nextLine();

        Students obj2 = new Students();
        System.out.println("Enter Student name : ");
        obj2.setStudName(sc.nextLine());
        System.out.println("Enter RollNo : ");
        obj2.setRollNo(sc.nextInt());
        System.out.println("Enter percentage : ");
        obj2.setPercentage(sc.nextInt());
        sc.nextLine();

        Students obj5 = new Students();
        System.out.println("Enter Student name : ");
        obj5.setStudName(sc.nextLine());
        System.out.println("Enter RollNo : ");
        obj5.setRollNo(sc.nextInt());
        System.out.println("Enter percentage : ");
        obj5.setPercentage(sc.nextInt());
        sc.nextLine();

        Students obj3 = new Students();
        System.out.println("Enter Student name : ");
        obj3.setStudName(sc.nextLine());
        System.out.println("Enter RollNo : ");
        obj3.setRollNo(sc.nextInt());
        System.out.println("Enter percentage : ");
        obj3.setPercentage(sc.nextInt());
        sc.nextLine();

        Students obj4 = new Students();
        System.out.println("Enter Student name : ");
        obj4.setStudName(sc.nextLine());
        System.out.println("Enter RollNo : ");
        obj4.setRollNo(sc.nextInt());
        System.out.println("Enter percentage : ");
        obj4.setPercentage(sc.nextInt());
        sc.nextLine();

        arr[0]=obj1;
        arr[1]=obj2;
        arr[2]=obj3;
        arr[3]=obj4;
        arr[4]=obj5;

    }
    public void getStudentDetails(){
        for(Students obj : arr){
            System.out.println(obj.getStudName()+" , "+obj.getPercentage()+" , "+obj.getPercentage());
        }
    }
    public static void main(String[] args) {
        StudentsDataUsingArray obj = new StudentsDataUsingArray();
        obj.addStudent();
        obj.getStudentDetails();
    }
}
