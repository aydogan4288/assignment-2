package com.ferhat;

public class Circle implements Shape {


    public void calculateArea(double radius){
        System.out.println((radius*radius)*Math.PI);
    }

    public void display(){
        System.out.println("This is a circle");
    }

}
