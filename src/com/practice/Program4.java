package com.practice;

import java.util.Arrays;

public class Program4 {

    public void mergeSort(int[] arr,int low,int right){
       if(low<right) {
           int mid = (low + right) / 2;
           mergeSort(arr, low, mid);
           mergeSort(arr, mid + 1, right);
           merge(arr, low, mid, right);
       }
    }
    public void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high - low + 1];
        int index = 0;
        //initializing left and right pointers
        int left=low,right=mid+1;
        while(left<=mid && right<=high){
            if(arr[low]<=arr[right]){
                temp[index++] = arr[left++];
            }else{
                temp[index++] = arr[right++];
            }
        }
        while (left <=mid) {
            temp[index++] = arr[left++];
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp[index++] = arr[right++];
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }


    public static void main(String[] args) {
        Program4 program4=new Program4();
        int[] arr=new int[]{5,4,3,2,1};
        program4.mergeSort(arr,0,4);
        System.out.println(Arrays.toString(arr));

    }
}
