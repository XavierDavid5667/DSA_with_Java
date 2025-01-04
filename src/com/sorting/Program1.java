package com.sorting;

import java.util.Arrays;

//selection sort algo
public class Program1 {

    public void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<min){
                     min=arr[j];
                     index=j;

                }
            }
            arr[index]=arr[i];
            arr[i]=min;
        }
    }
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        Program1 program1=new Program1();
        program1.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
