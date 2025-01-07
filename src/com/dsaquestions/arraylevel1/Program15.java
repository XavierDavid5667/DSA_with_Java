package com.dsaquestions.array;

public class Program15 {

    public static int countMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            }else {
                count = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 1, 1};
        int count = countMaxConsecutiveOnes(nums);
        System.out.println(count);
    }
}
