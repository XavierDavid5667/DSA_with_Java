package com.dsaquestions.arraylevel2;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveOptimal {

    public int largest(int[] arr) {
        int largest = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i : set) {
            if (!set.contains(i - 1)) {
                int count = 1;
                int x = i;
                while (set.contains(x + 1)) {
                    count += 1;
                    x = x + 1;
                }
               largest= Math.max(largest, count);
            }
        }
        return largest;
    }

    public static void main(String[] args) {
       LongestConsecutiveOptimal optimal=new LongestConsecutiveOptimal();
        int largest = optimal.largest(new int[]{100, 200, 1, 3, 2, 4});
        System.out.println(largest);
    }
}
