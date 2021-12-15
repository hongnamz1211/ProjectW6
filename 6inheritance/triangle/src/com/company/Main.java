package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();
        Triangle triangle = new Triangle();

        System.out.println("Nhập màu: ");
        String color = scanner.nextLine();
        System.out.println("Nhập chiều dài cạnh thứ nhất: ");
        double side1 = scanner.nextDouble();
        System.out.println("Nhập chiều dài cạnh thứ hai: ");
        double side2 = scanner.nextDouble();
        System.out.println("Nhập chiều dài cạnh thứ ba: ");
        double side3 = scanner.nextDouble();

        shape = new Shape(color);
        triangle = new Triangle(color,side1,side2,side3);

        System.out.println(shape);
        System.out.println(triangle);
    }
}
