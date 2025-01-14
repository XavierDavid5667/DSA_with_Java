package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Progam6 {
    public static void twoSum(int[] arr, int target) {
        int n = arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int otherNum = target - arr[i];
            if (map.containsKey(otherNum)) {
                System.out.println(otherNum+" "+arr[i]);
            }
            map.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
     int[] arr={1,-1,-1,2,2};
     int target=1;
     twoSum(arr,target);

    }
}
