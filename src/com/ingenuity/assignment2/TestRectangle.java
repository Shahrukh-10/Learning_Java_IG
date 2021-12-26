package com.ingenuity.assignment2;

import java.util.Scanner;

class Rectangle{
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(){
        this.height = 5;
        this.width = 5;
    }

    public double calArea(){
        return getHeight()*getWidth();
    }
}

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println(obj.calArea());
        obj.setHeight(sc.nextDouble());
        obj.setWidth(sc.nextDouble());
        System.out.println(obj.calArea());
    }
}
