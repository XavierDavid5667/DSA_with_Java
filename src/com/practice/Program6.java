package com.practice;

public class Program6 {

    public static int maxSumSubArray(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;

    }

    public static void main(String[] args) {
    int[] arr={-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSumSubArray(arr));
    }
}
