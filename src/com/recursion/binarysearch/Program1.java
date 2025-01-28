package com.recursion.binarysearch;

import java.util.Scanner;

public class Program1 {

    public int binarySearch(int[] arr, int target,int start,int end) {
        if(start>end) return -1;

        int mid=start+(end-start)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return binarySearch(arr,target,start,mid-1);
        else return binarySearch(arr,target,mid+1,end);
    }


    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        Program1 program1=new Program1();
        System.out.println(program1.binarySearch(arr,36,0,arr.length-1));
    }
}
