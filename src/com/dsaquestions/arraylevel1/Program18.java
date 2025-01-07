package com.dsaquestions.array;

import java.util.*;

public class Program18 {

    public static int longestSubArrayWithSumK(List<Integer> arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum == k) {
                maxSum = i + 1;
            }
            int rem = sum - k;
            if (map.containsKey(rem)) {
                maxSum = Math.max(maxSum, i - map.get(rem));
            } else {
                map.putIfAbsent(sum, i);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[]arr = {-5, 8, -14, 2, 4, 12};
        int k=-5;
        List<Integer> list = Arrays.stream(arr).mapToObj(i->i).toList();
        System.out.println(longestSubArrayWithSumK(list, k));
    }
}
