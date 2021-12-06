package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên");
        int num = scanner.nextInt();

        if (num < 2) {
            System.out.println("Số " + num + " không phải SNT");
        } else {
            int i = 2;
            boolean check = true;
            while (i < num) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println("Số " + num + " là SNT");
            } else {
                System.out.println("Số " + num + " không là SNT");
            }
        }
    }
}
