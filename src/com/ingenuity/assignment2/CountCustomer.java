package com.ingenuity.assignment2;

import java.util.Scanner;

class Customer{
    private int custNo;
    private String custName;
    private static int custCount;

    public int getCustNo() {
        return custNo;
    }

    public static int getCusCount(){
        return custCount;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    static {
        custCount = 0;
    }
    public Customer(String custName , int custNo){
        this.custNo = custNo;
        this.custName = custName;
        custCount++;
    }
}

public class CountCustomer {
    public static void main(String[] args) {
        System.out.println(Customer.getCusCount());

        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        int no1 = sc.nextInt();
        Customer obj = new Customer(name1 , no1);
        System.out.println(Customer.getCusCount());

        String name2 = sc.nextLine();
        int no2 = sc.nextInt();
        Customer obj1 = new Customer(name2 , no2);
        System.out.println(Customer.getCusCount());

        String name3 = sc.nextLine();
        int no3 = sc.nextInt();
        Customer obj2 = new Customer(name3 , no3);
        System.out.println(Customer.getCusCount());

    }
}
