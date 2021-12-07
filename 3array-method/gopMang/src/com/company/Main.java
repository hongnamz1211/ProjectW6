package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] array1;
        int[] array2;
        array1 = new int[5];
        array2 = new int[6];
        int i1 = 0;
        while (i1 < array1.length) {
            System.out.print("Enter element " + (i1 + 1) + " in array1: ");
            array1[i1] = scanner.nextInt();
            i1++;
        }
        int i2 = 0;
        while (i2 < array2.length) {
            System.out.print("Enter element " + (i2 + 1) + " in array2: ");
            array2[i2] = scanner.nextInt();
            i2++;
        }
        int[] array3;
        array3 = new int[11];
        System.out.println("Array1");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
            array3[i] = array1[i];
        }
//        System.out.println("\n" + "Array3 -- 1");
//        for (int i = 0; i < array3.length; i++) {
//            System.out.print(array3[i] + "\t");
//        }
        System.out.println("\n" + "Array2");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
            array3[i + array1.length] = array2[i];
        }
        System.out.println("\n" + "Array3");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
