package com.sorting;

import java.util.Arrays;

public class Program5 {

    public void sort(int[] arr, int n){
        if(n==1){
            return;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        sort(arr,n-1);
    }
    public static void main(String[] args) {
        Program5 program5=new Program5();
        int[] arr={13,46,24,52,20,9};
        program5.sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
