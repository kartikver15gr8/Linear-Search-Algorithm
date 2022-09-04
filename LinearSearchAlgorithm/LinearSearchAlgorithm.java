package com.LinearSearchAlgorithm;

import java.util.Scanner;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 45, 78, 586, 45, 7, 97, 100};
        System.out.println("Enter the number you want to find in the array:");
        int n = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Yes! " + n + " exists in the array 'arr'.");
            } else if (i == arr.length - 1 && arr[i] != n) {
                System.out.println("No! " + n + " does not exists in the array 'arr'.");
            }
        }
    }
}
