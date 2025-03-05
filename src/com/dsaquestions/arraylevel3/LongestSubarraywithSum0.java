package com.dsaquestions.arraylevel3;

import java.util.Arrays;

public class LongestSubarraywithSum0 {

    public static int lengthOfSubarraywithSumwith0(int[] arr) {
        int n = arr.length;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, -3, 3, -1, 6, -5};
        int[] arr2 = {6, -2, 2, -8, 1, 7, 4, -10};
       // int i = lengthOfSubarraywithSumwith0(arr2);
        //System.out.println(i);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
