package com.dsaquestions.arraylevel3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraywithSUm0Optimal {

    public static int getLongestSubarray(int[] arr) {
        int maxLength = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int preFixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            preFixSum += arr[i];
            if (preFixSum == 0) {
                maxLength = Math.max(maxLength, i + 1);
            }else {
                if (map.containsKey(preFixSum)) {
                    maxLength = Math.max(maxLength, i - map.get(preFixSum));
                } else {
                    map.put(preFixSum, i);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
          int[] arr={6, -2, 2, -8, 1, 7, 4, -10};
        int longestSubarray = getLongestSubarray(arr);
        System.out.println(longestSubarray);
    }
}
