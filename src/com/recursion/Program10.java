package com.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Program10 {

    public static void swap(int arr[] ,int i,int j){
        if(i==j){
            return;
        }
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        swap(arr,i+1,j-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr={5,4,3,2,1};
        swap(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
