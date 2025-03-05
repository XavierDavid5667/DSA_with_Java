package com.dsaquestions.arraylevel2;

import java.util.*;

public class LongestSubSequenceBetter {

    public  static  int longestSubsequence(int[] arr){
        Arrays.sort(arr);
        int lastSmaller=Integer.MIN_VALUE;
        int count=1;
        int longest=1;
        for(int i=0;i<arr.length;i++){
           if(arr[i]-1==lastSmaller){
               count+=1;
               lastSmaller=arr[i];
           }
           else if(arr[i]!=lastSmaller){
               count=1;
               lastSmaller=arr[1];
           }
        longest=Math.max(longest,count);
        }

        return longest;
    }


    public static void main(String[] args) {
    int[] arr={1,1,1,2,2,3,4,5,6,100,122,11};
        int i = longestSubsequence(arr);
        System.out.println(i);
    }
}
