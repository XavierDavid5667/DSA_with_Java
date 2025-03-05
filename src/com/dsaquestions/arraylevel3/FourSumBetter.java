package com.dsaquestions.arraylevel3;

import java.util.*;

public class FourSumBetter {
    public static Set<List<Integer>> getQuard(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> setOfQuad = new HashSet<>();
        Set<Integer> cacheNumBetweenJandK = new HashSet<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1; j++) {
                for (int k = j+1; k < n; k++) {
                    int remaining = target - (arr[i] + arr[j] + arr[k]);
                    if (cacheNumBetweenJandK.contains(remaining)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add(remaining);
                        Collections.sort(list);
                        cacheNumBetweenJandK.add(arr[k]);
                        setOfQuad.add(list);
                    } else {
                        cacheNumBetweenJandK.add(arr[k]);
                    }
                }
                cacheNumBetweenJandK.clear();
            }
        }
        return setOfQuad;
    }


    public static void main(String[] args) {
        int[] arr = {1, 0, -2, -2, 2, 0};
        Set<List<Integer>> quard = getQuard(arr, 0);
        for (List<Integer> list : quard) {
            System.out.println(list);
        }
    }
}
