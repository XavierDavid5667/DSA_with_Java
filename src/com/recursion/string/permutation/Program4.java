package com.recursion.string.permutation;

import java.util.Arrays;

public class Program4 {
    public static int permute(int[] arr) {
        int n = arr.length;
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            //Todo: reverse array and return the int
            int left = 0;
            int right=n-1;
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            int res=0;
            for(int i=0;i<arr.length;i++) {
                res=res*10+arr[i];
            }
            return res;
        }
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        int left = index + 1;
        int right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        int res=0;
        for(int i=0;i<arr.length;i++) {
            res=res*10+arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int permute = permute(new int[]{1, 3, 2});
        System.out.println(permute);
    }
}
