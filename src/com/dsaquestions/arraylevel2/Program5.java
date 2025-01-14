package com.dsaquestions.arraylevel2;

import java.util.Arrays;

//sort an array of 0 1 and 2
public class Program5 {
    public static void sort(int[] arr) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int mid=0;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp=arr[lo];
                arr[lo]=arr[mid];
                arr[mid]=temp;
                lo++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                int temp=arr[hi];
                arr[hi]=arr[mid];
                arr[mid]=temp;
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,0,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
