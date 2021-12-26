package com.ingenuity.assignment1;

import java.util.Scanner;

class Employee{
    private int empNo;
    private String empName;
    private int empSal;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }
}

public class EmployeeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee obj1 = new Employee();
        System.out.println("Enter name : ");
        obj1.setEmpName(sc.nextLine());
        System.out.println("Enter no : ");
        obj1.setEmpNo(sc.nextInt());
        System.out.println("Enter salary : ");
        obj1.setEmpSal(sc.nextInt());
        sc.nextLine();

        Employee obj2 = new Employee();
        System.out.println("Enter name : ");
        obj2.setEmpName(sc.nextLine());
        System.out.println("Enter no : ");
        obj2.setEmpNo(sc.nextInt());
        System.out.println("Enter salary : ");
        obj2.setEmpSal(sc.nextInt());
        sc.nextLine();


        Employee obj3 = new Employee();
        System.out.println("Enter name : ");
        obj3.setEmpName(sc.nextLine());
        System.out.println("Enter no : ");
        obj3.setEmpNo(sc.nextInt());
        System.out.println("Enter salary : ");
        obj3.setEmpSal(sc.nextInt());
        sc.nextLine();

        Employee obj4 = new Employee();
        System.out.println("Enter name : ");
        obj4.setEmpName(sc.nextLine());
        System.out.println("Enter no : ");
        obj4.setEmpNo(sc.nextInt());
        System.out.println("Enter salary : ");
        obj4.setEmpSal(sc.nextInt());
        sc.nextLine();

        Employee obj5 = new Employee();
        System.out.println("Enter name : ");
        obj5.setEmpName(sc.nextLine());
        System.out.println("Enter no : ");
        obj5.setEmpNo(sc.nextInt());
        System.out.println("Enter salary : ");
        obj5.setEmpSal(sc.nextInt());
        sc.nextLine();

        System.out.println(obj1.getEmpName() + " , " + obj1.getEmpNo()+" , "+obj1.getEmpSal());
        System.out.println(obj2.getEmpName() + " , " + obj2.getEmpNo()+" , "+obj2.getEmpSal());
        System.out.println(obj3.getEmpName() + " , " + obj3.getEmpNo()+" , "+obj3.getEmpSal());
        System.out.println(obj4.getEmpName() + " , " + obj4.getEmpNo()+" , "+obj4.getEmpSal());
        System.out.println(obj5.getEmpName() + " , " + obj5.getEmpNo()+" , "+obj5.getEmpSal());
    }

}
