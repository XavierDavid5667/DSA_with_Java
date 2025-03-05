package com.dsaquestions.arraylevel2;

import java.util.Arrays;
import java.util.Map;

/**
 * Algorithm
 * ->
 */
public class LongestConsecutiveSubsequence2 {

    public int longestConsecutiveSubsequence(int[] arr){
        int lastSmaller=Integer.MIN_VALUE;
        int count=0;
        int longest=1;
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==lastSmaller){
                lastSmaller=arr[i];
                count+=1;
            } else if (arr[i]!=lastSmaller) {
                lastSmaller=arr[i];
                count=1;
            }
            longest= Math.max(longest,count);
        }
        return  count;
    }

    public static void main(String[] args) {

    }
}
