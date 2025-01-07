package com.dsaquestions.array;

import java.util.Arrays;

public class Program7 {

    public static int[] moveZeros(int n, int []a) {
         int j=0;
         int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(a[i]!=0){
             arr[j++]=a[i];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
     int[] arr={0,0,0,0,1};
     arr=moveZeros(5,arr);
     System.out.println(Arrays.toString(arr));
    }
}
