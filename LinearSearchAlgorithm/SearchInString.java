package com.LinearSearchAlgorithm;

public class SearchInString {
    public static void main(String[] args) {
        String str = "The Subtle Art Of Not Giving A F*ck";
        char target = 't';
        int start = 5;
        int end = 10;
        boolean ans = searchInString(str, target);
        System.out.println(ans);
        boolean ans1 = searchInRange(str, target, start, end);
        System.out.println(ans1);
    }

    private static boolean searchInString(String str, char target) {
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                result = true;
            }
        }return result;
    }

    /*To search any character in some range of the string
    * the below function can be used, It starts with the starting
    * point and search till the end point defined above */
    private static boolean searchInRange(String str, char target, int start, int end) {
        boolean result = false;
        for (int i = start; i <= end ; i++) {
            if (str.charAt(i) == target) {
                result = true;
            }
        }
        return result;
    }
}
