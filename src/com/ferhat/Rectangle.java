package com.ferhat;

public class Rectangle implements Shape {

    public int calculateArea(int a, int b){
        return a*b;
    }

    public void display(){
        System.out.println("This is a Rectangle");
    }
}
