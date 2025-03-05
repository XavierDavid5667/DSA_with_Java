package com.dsaquestions.arraylevel3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OverLappingArrayBruteforce2 {

    public static List<List<Integer>> mergeOverlappingArray(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if (!list.isEmpty() && end <= list.get(list.size() - 1).get(1)) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] < end) {
                    end = Math.max(end, (arr[j][1]));
                } else {
                    break;
                }
            }
            list.add(Arrays.asList(start, end));
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr={{1,3},{2,6},{8,10},{15,18}};
        List<List<Integer>> list = mergeOverlappingArray(arr);
        System.out.println(list);
    }
}
