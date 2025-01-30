package com.recursion.sorting;

import java.util.Arrays;

public class MergeSortUsingArray {

    public int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
       int mid= arr.length/2;
       int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
       int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
       return merge(left,right);
    }
    public int[] merge(int[] left,int[] right){
        int length=left.length+ right.length;
        int[] temp=new int[length];
        int i=0;
        int j=0;
        int k=0;

        // looping through both array and comparing
        while(i< left.length && j< right.length) {
            if (left[i] < right[j]) {
                temp[k++] = left[i++];
            } else {
                temp[k++] = right[j++];
            }
        }
        //if array lengths are unequal
        while(i<left.length){
            temp[k++]=left[i++];
        }
        while(j< right.length){
            temp[k++]=right[j++];
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr={6,5,3,1,8,7,2,4};
        MergeSortUsingArray mergeSortUsingArray=new MergeSortUsingArray();
        int[] ints = mergeSortUsingArray.mergeSort(arr);
        System.out.println(Arrays.toString(ints));
    }
}
