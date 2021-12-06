package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double numVND, numUSD;
        System.out.println("Nhập số tiền muốn chuyển từ USD - VND");
        numUSD = scanner.nextDouble();
        numVND = numUSD * 23000;
        System.out.print(numUSD + " USD = " + numVND + " VND");
    }
}
