package com.recursion.sorting;

import java.util.Arrays;

public class SelectionSort {

    public void sort(int[] arr,int index,int n){

        //base condition
        if(index==n){
            return;
        }

        //recursion
        int min=arr[index];
        int minIndex=index;
        for(int i=index+1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        int temp=arr[minIndex];
        arr[minIndex]=arr[index];
        arr[index]=temp;
        sort(arr,index+1,n);

    }
    public static void main(String[] args) {
        int[] arr={5,4,1,2,3};
        SelectionSort selectionSort=new SelectionSort();
        selectionSort.sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
