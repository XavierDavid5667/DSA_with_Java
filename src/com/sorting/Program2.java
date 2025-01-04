package com.sorting;

import java.util.*;


//sort using bubble sort
public class Program2 {
    public void sort(int[] arr){

        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        Program2 program2=new Program2();
        int[] arr={13,46,24,52,20,9};
        program2.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
