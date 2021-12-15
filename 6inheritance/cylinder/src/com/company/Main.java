package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.4, "blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(4.0);
        System.out.println(cylinder);

        cylinder = new Cylinder(3.4, "yellow", 5.0);
        System.out.println(cylinder);
    }
}
