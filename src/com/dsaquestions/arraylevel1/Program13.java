package com.dsaquestions.array;

import java.util.ArrayList;
import java.util.List;

public class Program13 {

    public static List<Integer> union(int[] arr1, int[] arr2) {
        List<Integer> list =new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i]==arr2[i] && !list.contains(arr1[i])){
                list.add(arr1[i]);
            }else if(!list.contains(arr1[i]) && !list.contains(arr2[j])){
                list.add(arr1[i]);
                list.add(arr2[j]);
            }
            i++;
            j++;
        }
       return list;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,4,5};
        System.out.println(union(arr1,arr2));

    }
}
