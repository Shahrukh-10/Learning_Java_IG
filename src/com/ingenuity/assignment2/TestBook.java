package com.ingenuity.assignment2;

import java.util.Scanner;

class Book{
    private int bookNo;
    private String title;
    private String publication;
    private String author;
    private float price;

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

class Computer extends Book{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void showDetails(){
        System.out.println("Type : "+getType()+" Title :"+getTitle()+" Author :"+getAuthor()+" Publication :"+getPublication() + " Price :"+getPrice());
    }
}
class Mathematics extends Book{
    private String type;

    public void showDetails(){
        System.out.println("Type : "+getType()+" Title :"+getTitle()+" Author :"+getAuthor()+" Publication :"+getPublication() + " Price :"+getPrice());
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public class TestBook {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Computer obj = new Computer();
        Mathematics objs = new Mathematics();

        System.out.println("Enter type : ");
        obj.setType(sc.nextLine());
        System.out.println("Enter Publication : ");
        obj.setPublication(sc.nextLine());
        System.out.println("Enter title : ");
        obj.setTitle(sc.nextLine());
        System.out.println("Enter author : ");
        obj.setAuthor(sc.nextLine());
        System.out.println("Enter Book no : ");
        obj.setBookNo(sc.nextInt());
        System.out.println("Enter Price : ");
        obj.setPrice(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter type : ");
        objs.setType(sc.nextLine());
        System.out.println("Enter Publication : ");
        objs.setPublication(sc.nextLine());
        System.out.println("Enter title : ");
        objs.setTitle(sc.nextLine());
        System.out.println("Enter author : ");
        objs.setAuthor(sc.nextLine());
        System.out.println("Enter Book no : ");
        objs.setBookNo(sc.nextInt());
        System.out.println("Enter Price : ");
        objs.setPrice(sc.nextInt());

        obj.showDetails();
        objs.showDetails();
    }

}
