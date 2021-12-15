package com.company;

import javafx.scene.shape.Circle;

import javax.crypto.Cipher;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);

        Circles circle = new Circles();
        System.out.println(circle);

        circle = new Circles(3.5);
        System.out.println(circle);

        circle = new Circles(3.5, "red", true);
        System.out.println(circle);


//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(20, 30);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle("red", true, 30, 20);
//        System.out.println(rectangle);
//
//        Square square = new Square();
//        System.out.println(square);
//
//        square = new Square(30);
//        System.out.println(square);
//
//        square = new Square("blue", true, 30);
//        System.out.println(square);
    }
}
