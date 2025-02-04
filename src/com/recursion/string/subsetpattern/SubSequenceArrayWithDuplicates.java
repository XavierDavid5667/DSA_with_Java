package com.recursion.string.subsetpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequenceArrayWithDuplicates {

    public static List<List<Integer>> subseq(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i> 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n=outer.size();
            for (int j = start; j <n; j++) {
                List<Integer> list = new ArrayList<>(outer.get(j));
                list.add(arr[i]);
                outer.add(list);
            }

        }
        return outer;
    }

    public static void main(String[] args) {
        List<List<Integer>> subseq = subseq(new int[]{1, 2, 2,2,2});
        for(List<Integer> list:subseq){
            System.out.println(list);
        }
    }

}
