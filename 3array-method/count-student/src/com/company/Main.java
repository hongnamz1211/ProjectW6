package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng sinh viên trong lớp: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.print("Không được vượt quá 30");
            }
        } while (size > 30);
        arr = new int[size];

        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập điểm của sinh viên " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("Danh sách điểm của sinh viên:");;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(j + "\t");
            if (arr[j] >= 5 && arr[j] <= 10) {
                count++;
            }
        }
        System.out.print("\n" + "Có " + count + " thi đỗ");
    }
}
