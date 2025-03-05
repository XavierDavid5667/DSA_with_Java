package com.dsaquestions.arraypractice;

import java.util.HashMap;

public class Program3 {

    public static int maxLengthSubArrayWithLengthk(int[] arr, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }
            int rem=prefixSum - k;
            if (hashMap.containsKey(rem)) {
                int length = i-hashMap.get(rem);
                maxLength = Math.max(maxLength, length);
            }
            if (!hashMap.containsKey(prefixSum)) {
                hashMap.put(prefixSum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int i = maxLengthSubArrayWithLengthk(arr, 3);
        System.out.println(i);
    }
}
