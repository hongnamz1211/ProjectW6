package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []arr = {3,4,5,6,8,2,9,1};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int []array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
