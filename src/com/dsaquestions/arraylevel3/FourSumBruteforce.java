package com.dsaquestions.arraylevel3;

import java.util.*;

public class FourSumBruteforce {

    public static Set<List<Integer>> findQuadruplets(int[] arr,int target) {
        int n = arr.length;
        Set<List<Integer>> quadrupletsList = new HashSet<>();
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            List<Integer> list = new ArrayList<>();
                            list.add(arr[i]);
                            list.add(arr[j]);
                            list.add(arr[k]);
                            list.add(arr[l]);
                            Collections.sort(list);
                            quadrupletsList.add(list);
                        }
                    }
                }
            }
        }
        return quadrupletsList;
    }
    public static void main(String[] args) {
        int[] arr={4,3,3,4,4,2,1,2,1,1};
        Set<List<Integer>> quadruplets = findQuadruplets(arr, 9);
        for(List<Integer>list:quadruplets){
            System.out.println(list);
        }
    }
}
