package com.ingenuity.assignment2;

import java.util.Scanner;

class Employees{
    private int empNo;
    private String empName;

    public int getEmpNo() {
        return empNo;
    }


    public String getEmpName() {
        return empName;
    }


    public int getEmpSal() {
        return empSal;
    }


    private int empSal;

    public Employees(String name , int no ,int sal){
        empName = name;
        empNo = no;
        empSal = sal;
    }
    public void showDetails(){
        System.out.println("Name : "+getEmpName()+" EmpNo : "+getEmpNo()+" EmpSal : "+getEmpSal());
    }
}

public class EmployeeDataUsingParameterized {
    public static void main(String[] args) {
        Employees obj = new Employees("Vijay",6231,30000);
        obj.showDetails();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String no = sc.nextLine();
        System.out.println("Enter no : ");
        int num = sc.nextInt();
        System.out.println("Enter sal : ");
        int sal = sc.nextInt();
        Employees ob = new Employees(no,num ,sal);
        ob.showDetails();
    }
}
