package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] students = {
                "1", "2", "3", "4", "5", "6"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is:" + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("No found" + input_name + " in the list");
        }
    }
}
