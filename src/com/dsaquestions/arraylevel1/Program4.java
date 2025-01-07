package com.dsaquestions.array;

import java.util.Arrays;

public class Program4 {

    public static int removeDuplicates(int[] arr,int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              //  arr[++i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,3,4,4,5,5}; //1 2 2 3 3 3 4 4 5 5
        int k=removeDuplicates(arr, arr.length);
        System.out.println(Arrays.toString(arr)+" "+k);
    }
}
