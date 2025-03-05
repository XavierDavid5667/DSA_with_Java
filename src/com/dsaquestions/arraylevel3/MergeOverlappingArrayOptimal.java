package com.dsaquestions.arraylevel3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingArrayOptimal {

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (list.isEmpty()) {
                list.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            int end = list.get(list.size() - 1).get(1);
            if (arr[i][0] < end) {
                end = Math.max(end, arr[i][1]);
                List<Integer> list1 = list.get(list.size() - 1);
                list1.set(1, end);
            } else {
                list.add(Arrays.asList(arr[i][0], arr[i][1]));
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 4}, {2, 6}, {8, 9}, {8, 10}, {9, 11}, {15, 18}, {16, 17}};
        List<List<Integer>> list = mergeOverlappingIntervals(arr);
        for (List<Integer> l : list) {
            System.out.println(l);
        }
    }
}
