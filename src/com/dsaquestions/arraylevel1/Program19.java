package com.dsaquestions.array;

import java.util.HashMap;
import java.util.Map;

public class Program19 {

    public static int maxLen(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max_len = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == 0) {
                max_len = i + 1;
            }
            if(map.containsKey(sum)){
                max_len = Math.max(max_len,i-map.get(sum));
            }else{
                map.put(sum,i);
            }

        }
        return max_len;
    }

    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(maxLen(arr));
    }
}
