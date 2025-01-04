package com.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {

    public static void divideSort(int[] arr,int low,int high){

        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        divideSort(arr,low,mid);
        divideSort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    public static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer>list=new ArrayList<>();
        int left=low,right=mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
        // if elements on the left half are still left //

        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = 7;
            int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
            System.out.println("Before sorting array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
             divideSort(arr, 0, n - 1);
            System.out.println("After sorting array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

