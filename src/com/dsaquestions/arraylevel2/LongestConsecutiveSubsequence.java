package com.dsaquestions.arraylevel2;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {

    public static int  longestSubsequnce(int[] arr){
       int count=1;
        Arrays.sort(arr);
        for(int i=0;i< arr.length-1;i++) {
            if (arr[i+1]-arr[i] == 1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       int[] arr={100, 200, 1, 2, 3, 4};
        int i = longestSubsequnce(arr);
        System.out.println(i);
    }
}
