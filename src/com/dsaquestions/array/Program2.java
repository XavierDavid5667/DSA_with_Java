package com.dsaquestions.array;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static List<Integer> removeDuplicates(int[] arr,int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
     //  List<Integer>list= List.of(1,1,2,3,3,4,5,5,5);
        int[] arr={1,1,2,3,3,4,5,5,5};
        System.out.println(removeDuplicates(arr, arr.length));

    }
}
