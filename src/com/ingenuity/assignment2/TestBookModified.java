package com.ingenuity.assignment2;

import java.util.Scanner;

class Books{
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

class Computers extends Books{
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
class Mathematic extends Books{
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

public class TestBookModified {
    private Books[] book = new Books[4];
    public void showAllDetails(){
        for(Books b : book ){
            System.out.print(b.getTitle() + " ");
            System.out.print(b.getAuthor() + " ");
            System.out.print(b.getPublication() + " ");
            System.out.print(b.getPrice() + " ");
            System.out.print(b.getBookNo() + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Computers obj = new Computers();
        Computers obj1 = new Computers();
        Mathematic objs = new Mathematic();
        Mathematic objs1 = new Mathematic();

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
        obj1.setType(sc.nextLine());
        System.out.println("Enter Publication : ");
        obj1.setPublication(sc.nextLine());
        System.out.println("Enter title : ");
        obj1.setTitle(sc.nextLine());
        System.out.println("Enter author : ");
        obj1.setAuthor(sc.nextLine());
        System.out.println("Enter Book no : ");
        obj1.setBookNo(sc.nextInt());
        System.out.println("Enter Price : ");
        obj1.setPrice(sc.nextInt());
        sc.nextLine();

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
        TestBookModified o = new TestBookModified();
        o.book[0]=obj;
        o.book[1]=obj1;
        o.book[2]=objs;
        o.book[3]=obj1;

        o.showAllDetails();
//        obj.showDetails();
//        obj1.showDetails();
//        objs.showDetails();
//        objs1.showDetails();
    }

}
