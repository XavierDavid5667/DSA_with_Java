package com.sorting;

import java.util.Arrays;

public class Program7 {

    public static void quicksort(int[] arr,int low,int high){
         if(low<high){
           int pi=partition(arr,low,high);
           quicksort(arr,low,pi-1);
           quicksort(arr,pi+1,high);
         }

    }

    public static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int k=high;

        //Here we loop through the array from right to left ,we assume last as high and swap element greater than pivot to the left
        for(int i=high;i>low;i--){
            if(arr[i]>pivot){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k--;
            }
        }
        int temp=arr[low];
        arr[low]=arr[k];
        arr[k]=temp;
       return k;
    }
    public static void main(String[] args) {
      int[] arr={13,46,24,52,20,9};
      quicksort(arr,0,arr.length-1);
      System.out.println(Arrays.toString(arr));
    }
}
