package com.practice;

import java.util.Arrays;

public class Program5 {
    public void mergeSort(int[] arr,int low,int right){

        if(low<right){
            int mid=(low+right)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,low,mid,right);
        }
    }

    public void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int index=0;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[index++]=arr[left++];
            }else {
                temp[index++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[index++]=arr[left++];
        }
        while(right<=high){
            temp[index++]=arr[right++];
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }

    public static void main(String[] args) {
        Program5 program4=new Program5();
        int[] arr=new int[]{2,2,0,1,1,0};
        program4.mergeSort(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
}
