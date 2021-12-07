package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int[][] array = {
                {1,2,3,4,5},
                {6,7,8,9,0},
                {2,4,6,8,0}
        };
        int j;
        do {
            System.out.print("Nhập cột muốn tính tổng: ");
            j = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            System.out.println("Tổng của cột " + j + ": " + sum);
        } while (j != -1);
    }
}
