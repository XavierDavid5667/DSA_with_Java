package com.recursion;

import java.util.Arrays;
import java.util.Scanner;

// reverse using a a single variable
public class Program11 {

    public static void swap(int[] arr,int i){
        if(i>arr.length/2) return;
        int temp=arr[arr.length-1-i];
        arr[arr.length-1-i]=arr[i];
        arr[i]=temp;
        swap(arr,i+1);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr={5,4,3,2,1};
        swap(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
