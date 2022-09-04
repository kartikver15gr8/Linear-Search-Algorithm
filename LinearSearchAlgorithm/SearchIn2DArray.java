package com.LinearSearchAlgorithm;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {45, 12, 7},
                {78, 98, 1},
                {2, 97, 100}
        };
        int target = 145;
        boolean ans = searchIn2DArray(matrix, target);
        System.out.println(ans);
    }

    /*The below function will search an element whether
    * it exists in the 2D array "matrix" or not
    * if it does exist then the function will return 'true'
    * and if it does not exist then the function will
    * return false */
    static boolean searchIn2DArray(int[][] matrix, int target) {
        boolean result = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    result = true;
                }
            }
        }return result;
    }
}
