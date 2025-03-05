package com.dsaquestions.arraylevel3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNby3_2 {
    public static List<Integer> majorityElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int minLength = (int) Math.floor(arr.length / 3)+1;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            } else {
                map.computeIfPresent(arr[i], (k, v) -> v + 1);
            }
            if(map.get(arr[i])==minLength){
                list.add(arr[i]);
            }
        }
       // System.out.println(map);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> integers = majorityElement(arr);
        System.out.println(integers);

    }
}
