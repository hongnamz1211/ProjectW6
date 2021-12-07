package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int input;
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 5, 3, 4, 8, 5, 5, 9, 8, 2, 7};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Nhập phần tử muốn xóa: ");
        input = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            while (input == arr[i]) {
                System.arraycopy(arr, i + 1, arr, i, arr.length - 1 - i);
                arr[arr.length - 1] = 0;
            }
        }
        System.out.println("Array = " + Arrays.toString(arr));
    }
}
