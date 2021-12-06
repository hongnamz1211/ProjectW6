package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền bạn muốn vay: ");
        money = scanner.nextDouble();
        System.out.print("Nhập số tháng bạn muốn vay: ");
        month = scanner.nextInt();
        System.out.print("Nhập lãi suất mong muốn: ");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Số tiền lãi sau " + month + " tháng là: " + totalInterest);
    }
}
