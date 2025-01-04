package com.dsaquestions.array;

import java.util.Arrays;

public class Program10 {
    public static int[] rearrange(int[] arr){

        int j=-1;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return arr;
        }
            for(int i=j+1;i<n;i++){
                if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                }
            }
            return arr;
        }
    public static void main(String[] args) {
        int[] arr={0,0,0,0,1};
        arr=rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
