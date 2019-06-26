package com.ferhat;

public class Triangle implements Shape {


    public void calculateArea(double height, double base){
        System.out.println(0.5 * height * base);
    }

    public void display(){
        System.out.println("I am a Triangle");
    }
}
