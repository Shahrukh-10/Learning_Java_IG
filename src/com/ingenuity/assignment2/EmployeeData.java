package com.ingenuity.assignment2;

import java.util.Scanner;

class Employee{
    private int empNo;
    private String empName;

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

    private int empSal;

    public Employee(){
        empName = "Manjiri";
        empNo = 123;
        empSal = 25000;
    }
    public void showDetails(){
        System.out.println("Name : "+getEmpName()+" EmpNo : "+getEmpNo()+" EmpSal : "+getEmpSal());
    }
}

public class EmployeeData {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.showDetails();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        obj.setEmpName(sc.nextLine());
        System.out.println("Enter no : ");
        obj.setEmpNo(sc.nextInt());
        System.out.println("Enter sal : ");
        obj.setEmpSal(sc.nextInt());

        obj.showDetails();
    }
}
