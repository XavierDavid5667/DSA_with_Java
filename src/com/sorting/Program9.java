package com.sorting;

import java.util.Arrays;

public class Program9 {
    public  static void QuickSort(int[] arr, int low, int high) {
        if(low<high){
         int i=partition( arr,low,high);
         QuickSort(arr,low,i-1);
         QuickSort(arr,i+1,high);
        }
    }

    public static  int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int k=0;

        for(int i=0;i<high;i++){
            if(arr[i]<pivot){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
        }
        int temp=arr[high];
        arr[high]=arr[k];
        arr[k]=temp;
        return k;

    }
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
