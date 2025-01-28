package com.recursion.rotatedbinarysearch;

public class Program1 {

    public int rotatedBinarySearch(int[] arr,int target,int low,int high) {

        if(low>high) return -1;

        int mid=low+(high-low)/2;
        if(arr[mid]==target) return mid;

        if(arr[low]<=arr[mid]){
            if(arr[low]<=target && target<=arr[mid]){
                return rotatedBinarySearch(arr,target,low,mid-1);
            }else{
                return rotatedBinarySearch(arr,target,mid+1,high);
            }
        }else{
            if(arr[mid]<=target && target<=arr[high]){
                return rotatedBinarySearch(arr,target,mid+1,high);
            }else{
                return rotatedBinarySearch(arr,target,low,mid-1);
            }
        }

    }
    public static void main(String[] args) {

    }
}
