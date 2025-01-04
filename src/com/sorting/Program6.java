package com.sorting;

import java.util.Arrays;

public class Program6 {
    public static void sort(int[] arr,int j){
       if(j== arr.length){
           return;
       }
        while(j>0 && arr[j]<arr[j-1]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j=j-1;
        }
       sort(arr,j+1);
    }

    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        sort(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
