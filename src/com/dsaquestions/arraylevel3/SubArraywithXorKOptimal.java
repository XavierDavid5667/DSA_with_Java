package com.dsaquestions.arraylevel3;

import java.util.*;

public class SubArraywithXorKOptimal {
    public static int calculateXor(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> xorLoopUp = new LinkedHashMap<>();
        int xor = 0;
        int count = 0;
        xorLoopUp.put(0, 1);
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
            int x = xor ^ k;
            xorLoopUp.put(xor,xorLoopUp.getOrDefault(xor,0)+1);
            if (xorLoopUp.containsKey(x)) {
                Integer integer = xorLoopUp.get(x);
                count =count+integer;
            }
        }
            return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int k = 2;
        int i = calculateXor(arr, k);
        System.out.println(i);
    }

}
