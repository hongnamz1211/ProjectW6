package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size;
        Scanner scanner = new Scanner(System.in);
        int[][] arr;
        do {
            System.out.print("Nhập số mảng: ");
            size = scanner.nextInt();
            if (size > 5) {
                System.out.print("Nhập lại!!");
            }
        } while (size > 5);
        arr = new int[size][size];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập giá trị tại cột " + i + " & hàng " + j + ": ");
                arr[i][j] = scanner.nextInt();
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }
        System.out.println("\n" + "Tổng của đường chéo: " + sum);
    }
}
