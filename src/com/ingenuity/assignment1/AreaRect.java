package com.ingenuity.assignment1;

import java.util.Scanner;

class Rectangle{
 private double length;
 private double breadth;
 private double area;

 public double getLength() {
  return length;
 }

 public void setLength(double length) {
  this.length = length;
 }

 public double getBreadth() {
  return breadth;
 }

 public void setBreadth(double breadth) {
  this.breadth = breadth;
 }

 public double getArea() {
  return area;
 }

 public void setArea(double area) {
  this.area = area;
 }

 public double callArea(){
  double d = getLength()*getBreadth();
  return d;
 }
}

public class AreaRect {
 public static void main(String[] args) {
  Rectangle obj = new Rectangle();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter length and breadth .");
  obj.setLength(sc.nextInt());
  obj.setBreadth(sc.nextInt());
  System.out.println(obj.callArea());
 }
}
