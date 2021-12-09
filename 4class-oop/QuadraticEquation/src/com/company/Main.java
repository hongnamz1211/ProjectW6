package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập c: ");
        int c = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.print("Delta: " + quadraticEquation.getDiscrimiant());
        if (quadraticEquation.getDiscrimiant() > 0) {
            System.out.print("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscrimiant() == 0) {
            System.out.print("The equation have one root " + (- b / 2  * a));
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
