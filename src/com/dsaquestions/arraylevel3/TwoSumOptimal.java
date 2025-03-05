package com.dsaquestions.arraylevel3;

import java.util.Arrays;

public class TwoSumOptimal {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 6, 11};
        int target = 14;
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum<target){
                i++;
            } else if (sum>target) {
                j--;
            }else {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
