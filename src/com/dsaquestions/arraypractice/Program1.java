package com.dsaquestions.arraypractice;

public class Program1 {
    public static int longestSubArrayWithSum(int[] arr, int k) {
        int n = arr.length - 1;
        int maxSize = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            int sum = 0;
            int size = 0;
            for (int j = i; j <= n; j++) {
                sum = sum + arr[j];
                size++;
                if (sum == k) {
                    maxSize = Math.max(maxSize, size);
                }
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        System.out.println(longestSubArrayWithSum(arr, 5));

    }
}
