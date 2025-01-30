package com.recursion.sorting;

import java.util.Arrays;

public class QuickSort2 {

    public void quickSort(int[] arr, int low, int high) {
        //base condition
        if (low >= high) {
            return;
        }
        int pivotIndex = (low + high) / 2;  // Correct middle index
        int pivot = arr[pivotIndex];

        // Partitioning step
        int s = low;
        int e = high;

        while (s <= e) {

            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

        }
      //  if (low < e) {
            quickSort(arr, low, e);   // Sort the left part
     //   }
     //   if (s < high) {
            quickSort(arr, s, high);  // Sort the right part
      //  }
    }


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSort2 quickSort2 = new QuickSort2();
        quickSort2.quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
