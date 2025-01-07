package com.dsaquestions.array;

import java.util.Arrays;
import java.util.Scanner;

public class Program6 {

    public static int[] rotateArrayNTimes(int[] arr,int n){

        for(int i=0;i<n;i++){
            int temp=arr[0];
            for(int j=1;j< arr.length;j++){
              arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr={1, 2, 3, 4, 5};
        arr=rotateArrayNTimes(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
