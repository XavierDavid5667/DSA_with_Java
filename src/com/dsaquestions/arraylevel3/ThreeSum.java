package com.dsaquestions.arraylevel3;

import java.util.*;

public class ThreeSum {


    public static Set<List<Integer>> triplets(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> setOFUniqueTriplets = new HashSet<>();
        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        Collections.sort(list);
                        setOFUniqueTriplets.add(list);
                    }
                }
            }
        return setOFUniqueTriplets;
    }

    public static void main(String[] args) {
       int[] arr={-1,0,1,2,-1,-4};
        Set<List<Integer>> triplets = triplets(arr);
        for(List<Integer> list:triplets){
            System.out.println(list);
        }
    }
}
