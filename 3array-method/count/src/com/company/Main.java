package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "Hello everyone";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập 1 ký tự: ");
        String input = scanner.nextLine();
        int count = 0;
        char inputt = input.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (inputt == str.charAt(i)) {
                count++;
            }
        }
        System.out.print("Giá trị " + input + " xuất hiện " + count + " lần.");
    }
}
