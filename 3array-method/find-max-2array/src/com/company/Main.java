package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int[][] array = {
//                {1,3,5,7,9},
//                {2,4,6,8,0}
//        };
//        int max = array[0][0];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                }
//            }
//        }
//        System.out.println("GTLN là: " + max);

        Scanner scanner = new Scanner(System.in);
        int[][] array;
        int a, b;

        System.out.print("Enter row: ");
        a = scanner.nextInt();
        System.out.print("Enter col: ");
        b = scanner.nextInt();
        array = new int[a][b];
        System.out.println("Array: " + a + "row and " + b + " col");

        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Row: " + i + ", Col: " + j + "--");
                array[i][j] = scanner.nextInt();

                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("GTLN là: " + max);
//        int max = array[0][0];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                }
//            }
//        }
    }
}
