package com.dsaquestions.arraylevel2;

import java.util.Arrays;

public class Program12 {

    public static int[] rearrange(int[] arr){
        int n= arr.length/2;
        int[] positives=new int[n];
        int[] negatives=new int[n];
        int positivePointer=0;
        int negativePointer=0;
        for(int i=0;i< arr.length;i++){
        if(arr[i]>0 && positivePointer<n){
                positives[positivePointer++]=arr[i];
            }else if(arr[i]<0 && negativePointer<n){
                negatives[negativePointer++]=arr[i];
            }
        }
         positivePointer=0;
         negativePointer=0;
        for(int i=0;i< arr.length;i++){
            if(i%2==0){
                arr[i]=positives[positivePointer++];
            }else{
                arr[i]=negatives[negativePointer++];
            }
        }
        return arr;

    }
    public static void main(String[] args) {
     int[] arr={1,2,-3,-1,-2,3};
        System.out.println(Arrays.toString(rearrange(arr)));
    }
}
