package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int N = 2;
        while (N < 100) {
            boolean check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(N);
            }
            N++;
        }
    }
}
