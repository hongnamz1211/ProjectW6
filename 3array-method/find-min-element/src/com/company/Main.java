package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list: " + Arrays.toString(array));

        int min = array[0];
        for (int j = 0; j < array.length ; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("GTNN: " + min);
    }
}
