package com.recursion.sorting;

import java.util.Arrays;

/**
 * This class is used to sort an array using bubble sort
 */
public class BubbleSort {

    public static void sort(int[] arr,int n,int i){
        if(n==1){
            return;
        }
        if(i<n-1){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            sort(arr,n,i+1);
        }else {
            sort(arr,n-1,0);
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,2,1,3};
        sort(arr,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
}
