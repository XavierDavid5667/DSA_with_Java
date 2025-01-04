package com.sorting;

import java.util.Arrays;

public class Program3 {

    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
           int j=i+1;
           while(j>0 && arr[j]<arr[j-1]){
               int temp=arr[j-1];
               arr[j-1]=arr[j];
               arr[j]=temp;
               j=j-1;
           }
        }
    }

    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
