package com.patterns.slidingwindow;

import java.util.Scanner;

//Bruteforce approach for sliding window
public class Program1 {

    public int findMax(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - k + 1; i++) {
            int currentSum = 0;
            for (int j = 0; j < k; j++) {
                currentSum += arr[i + j];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
          int[] arr={1, 4, 2, 10, 23, 3, 1, 0, 20};
          Program1 program1=new Program1();
          System.out.println(System.nanoTime());
          System.out.println(program1.findMax(arr,4));

        }

}
