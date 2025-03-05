package com.dsaquestions.arraylevel3;

import java.util.*;

public class FourSumOptimal {

    public static void getQuad(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && arr[j] == arr[j - 1]) continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add(arr[l]);
                        set.add(list);
                        l--;
                        k++;
                        while(k<l && arr[k]==arr[k-1]) k++;
                        while(k<l && arr[l]==arr[l+1])l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }


        }
    }

    public static void main(String[] args) {

    }
}
