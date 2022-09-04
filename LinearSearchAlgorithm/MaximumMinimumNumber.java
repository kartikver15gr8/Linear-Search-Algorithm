package com.LinearSearchAlgorithm;

public class MaximumMinimumNumber {
    /**/
    public static void main(String[] args) {
        int[] nums = {1, 2, 45, 98, 98, 54, 78, 68, 0, 78454, 98, 7, 97};
        int ans = minimumNumber(nums);
        System.out.println("The minimum number in the whole array is " + ans);
        int ans2 = maximumNumber(nums);
        System.out.println("The maximum number in the whole array is " +ans2);
        int start = 1;
        int end = 5;
        int ans1 = minimumNumberInRange(nums, start, end);
        System.out.println("The minimum number in the range is "+start+" to "+end+" is " +ans1);
    }

    /*The below program will return the minimum value
     * in the array "nums" */
    static int minimumNumber(int[] nums) {
         int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    static int maximumNumber(int[] nums) {
         int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    /*The below function will return the minimum value
    * in some range of indices in the array "nums" */
    static int minimumNumberInRange(int[] nums, int start, int end) {
        int min = nums[0];
        for (int i = start; i <= end; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }return min;
    }
}
