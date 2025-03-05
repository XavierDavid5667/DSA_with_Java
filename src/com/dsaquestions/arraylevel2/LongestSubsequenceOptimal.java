package com.dsaquestions.arraylevel2;

import java.util.HashSet;
import java.util.Set;

public class LongestSubsequenceOptimal {

    public int longest(int[] arr){
        int longest = 1;
        Set<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        for(Integer i:set){
            if(!set.contains(i-1)) {
                int count = 1;
                int x = i;
                while (set.contains(x + 1)) {
                    count += 1;
                    x += 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {

    }
}
