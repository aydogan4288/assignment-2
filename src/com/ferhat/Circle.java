package com.ferhat;

public class Circle implements Shape {

    double radius;
    double pi = Math.PI;

    public void calculateArea(double radius,double pi){
        System.out.println((radius*radius)*pi);
    }

    public void display(){
        System.out.println("This is a circle");
    }

}
