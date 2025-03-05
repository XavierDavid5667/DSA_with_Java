package com.dsaquestions.arraylevel3;

import java.util.Arrays;

public class ThreeSumOptimal {

    public static void getTriplets(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int prevI = arr[i];
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k && j < n && k > 0) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    int prevJ = arr[j];
                    int prevK = arr[k];
                    while (arr[j] == prevJ) {
                        j++;
                    }
                    while (arr[k] == prevK) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            while (i<n && prevI == arr[i] ) {
                    i++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {-2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2};
        getTriplets(arr);
    }
}
