package com.ingenuity.assignment1;

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
public class BookData {
    private Book[] book = new Book[4];
    public void addBook(){
        Scanner sc = new Scanner(System.in);
        BookData obj = new BookData();
        Book ob1 = new Book();
        System.out.println("Book no :");
        ob1.setBookNo(sc.nextInt());
        System.out.println("Set price");
        ob1.setPrice(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter title");
        ob1.setTitle(sc.nextLine());
        System.out.println("Enter author");
        ob1.setAuthor(sc.nextLine());
        System.out.println("Enter publication");
        ob1.setPublication(sc.nextLine());

        Book ob2 = new Book();
        System.out.println("Book no :");
        ob2.setBookNo(sc.nextInt());
        System.out.println("Set price");
        ob2.setPrice(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter title");
        ob2.setTitle(sc.nextLine());
        System.out.println("Enter author");
        ob2.setAuthor(sc.nextLine());
        System.out.println("Enter publication");
        ob2.setPublication(sc.nextLine());

        Book ob3 = new Book();
        System.out.println("Book no :");
        ob3.setBookNo(sc.nextInt());
        System.out.println("Set price");
        ob3.setPrice(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter title");
        ob3.setTitle(sc.nextLine());
        System.out.println("Enter author");
        ob3.setAuthor(sc.nextLine());
        System.out.println("Enter publication");
        ob3.setPublication(sc.nextLine());

        Book ob4 = new Book();
        System.out.println("Book no :");
        ob4.setBookNo(sc.nextInt());
        System.out.println("Set price");
        ob4.setPrice(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter title");
        ob4.setTitle(sc.nextLine());
        System.out.println("Enter author");
        ob4.setAuthor(sc.nextLine());
        System.out.println("Enter publication");
        ob4.setPublication(sc.nextLine());

        book[0] = ob1;
        book[1] = ob2;
        book[3] = ob3;
        book[2] = ob4;
    }
    public void getBook(){
        for (int i=0;i<book.length;i++){
            System.out.print(book[i].getBookNo());
            System.out.print(book[i].getAuthor());
            System.out.print(book[i].getTitle());
            System.out.print(book[i].getPublication());
            System.out.print(book[i].getPrice());
        }
    }
    public static void main(String[] args) {

        BookData obj = new BookData();
        obj.addBook();
        obj.getBook();

    }
}
