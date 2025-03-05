package com.dsaquestions.arraylevel2;

import java.util.*;

public class CountSubArray {

    public static  int returnCountOfSubarray(int[] arr, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0,1);
        int prefixSum = 0;
        int countOFSubarray = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int rem = prefixSum - k;

            countOFSubarray+=prefixMap.getOrDefault(rem,0);

            prefixMap.put(prefixSum, prefixMap.getOrDefault(prefixSum,0)+1);
        }
        return countOFSubarray;
    }

    public static void main(String[] args) {
      int[] arr={3, 1, 2, 4};
      int k=6;
        int i = returnCountOfSubarray(arr, k);
        System.out.println(i);

    }
}
