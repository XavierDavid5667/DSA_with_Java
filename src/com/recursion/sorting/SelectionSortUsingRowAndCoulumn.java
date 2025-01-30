package com.recursion.sorting;

import java.util.Arrays;

public class SelectionSortUsingRowAndCoulumn {

    public void sort(int[]arr, int sorted, int currentIndex,int max) {
        if (sorted == 0) {
            return;
        }
            if (currentIndex < sorted) {
                if (arr[currentIndex] > arr[max]) {
                    sort(arr, sorted, currentIndex + 1, currentIndex);
                }else {
                    sort(arr, sorted, currentIndex + 1, max);
                }
            } else {
                int temp = arr[sorted-1];
                arr[sorted-1] = arr[max];
                arr[max] = temp;
                sort(arr, --sorted, 0, 0);

            }
        }

    public static void main(String[] args) {
        int[] arr={5,4,1,2,3};
        SelectionSortUsingRowAndCoulumn selectionSortUsingRowAndCoulumn=new SelectionSortUsingRowAndCoulumn();
        selectionSortUsingRowAndCoulumn.sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
