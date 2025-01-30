package com.recursion.sorting;

public class MergeSort {

    public void divide(int[]arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public void merge(int[]arr,int low,int mid,int high){
        int len=high-low+1;
        int[]temp=new int[len];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
        for(int l=0;l<len;l++){
            arr[low+l]=temp[l];
        }
    }

    public static void main(String[] args) {
        int[] arr={6,5,3,1,8,7,2,4};
        MergeSort obj=new MergeSort();
        obj.divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
