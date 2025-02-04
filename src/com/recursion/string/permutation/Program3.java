package com.recursion.string.permutation;

import java.util.ArrayList;
import java.util.List;

public class Program3 {

    public static void permute(List<List<Integer>> ans, int index, int[] arr) {
        if (index == arr.length) {
            List<Integer> permutationList = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                permutationList.add(arr[i]);
            }
            ans.add(permutationList);
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(ans, index+1, arr);
            // here we are re-swapping->BackTracking
            swap(arr, index, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = {1, 2, 3};
        permute(list,0,arr);
        System.out.println(list);
    }
}
