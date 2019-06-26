package com.ferhat;

public class Main {

    public static void main(String[] args) {
        int[][] a = {{1,2,8},{4,5,6},{99,1,-3}};

        printMax(a);

        // Reactangle
        Rectangle rect = new Rectangle();
        System.out.println(rect.calculateArea(4,4));
        rect.display();

        //Circle
        Circle circle = new Circle();
        circle.calculateArea(3, 3.14);
        circle.display();

        //Triangle
        Triangle tri = new Triangle();
        tri.calculateArea(5, 5);
        tri.display();
    }

        public static void printMax(int[][] arr){

            int max = arr[0][0];
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    if(arr[i][j] > max){
                        max = arr[i][j];
                    }
                }

            }
            System.out.println("Max number of the array" + max);
        }

}
