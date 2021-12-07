package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ví trí muốn thêm: ");
        int index = scanner.nextInt();
        System.out.print("\n" + "Nhập giá trị muốn thêm: ");
        int number = scanner.nextInt();
        int[] array = new int[arr.length + 1];

        add(number, index, array, arr);
        display(array);
    }
    public static void add(int number, int index, int[] array, int[] arr) {
        if (index <= -1 && index >= arr.length - 1) {
            System.out.println("Nhập lại");
        } else {
            for (int i = 0; i < index - 1; i++) {
                array[i] = arr[i];
            }
            for (int j = arr.length; j > index - 1; j--) {
                array[j] = arr[j - 1];
            }
            array[array.length - 1] = arr[arr.length - 1];
            array[index - 1] = number;
        }
    }
    public static void display(int[] array) {
        System.out.println("New array is: " + Arrays.toString(array));
    }
}
