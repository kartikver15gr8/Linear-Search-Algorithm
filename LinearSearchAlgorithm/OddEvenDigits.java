package com.LinearSearchAlgorithm;

import java.util.ArrayList;

public class OddEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 45, 78, 89, 56, 8, 0, 1234, 23, 77, 8, 47};
        ArrayList<Integer> ansEven = evenDigits(nums);
        System.out.println(ansEven);
        ArrayList<Integer> ansOdd = oddDigits(nums);
        System.out.println(ansOdd);
    }

    static ArrayList<Integer> evenDigits(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result.add(j,nums[i]);
                j++;
            }
        }return result;
    }
    static ArrayList<Integer> oddDigits(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result.add(j,nums[i]);
                j++;
            }
        }return result;
    }
}
