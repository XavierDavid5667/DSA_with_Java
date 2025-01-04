package com.dsaquestions.array;

import java.util.Arrays;

public class Program9 {

    public static int[] rotate(int[] arr, int d, int n) {

        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=d;
        j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=d-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int d=2;
        int n=arr.length;
        System.out.println(Arrays.toString(rotate(arr,d,n)));
    }
}
