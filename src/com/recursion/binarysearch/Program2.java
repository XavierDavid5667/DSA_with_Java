package com.recursion.binarysearch;

public class Program2 {

    public int binarySearchwithLoops(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        Program2 program2=new Program2();
        System.out.println(program2.binarySearchwithLoops(arr,36));
    }
}
