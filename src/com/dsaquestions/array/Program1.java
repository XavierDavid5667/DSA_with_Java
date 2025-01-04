package com.dsaquestions.array;


import java.util.Arrays;

public class Program1 {

    public static int[] largestElement9(int[] arr,int n){
        int max=arr[0];
        int secondMax= Integer.MIN_VALUE;
        int min=arr[0];
        int secondMin= Integer.MAX_VALUE;


        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max) {
                secondMax = arr[i];
            }
            if(arr[i]<min){
                secondMin=min;
                min=arr[i];
            }else if(arr[i]<secondMin && arr[i]!=min) {
                secondMin = arr[i];
            }
        }

        return new int[]{secondMax,secondMin};
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,2};
        int n=arr.length;
        System.out.println(Arrays.toString(largestElement9(arr, n)));
    }
}
