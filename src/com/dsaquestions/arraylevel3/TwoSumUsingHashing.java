package com.dsaquestions.arraylevel3;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashing {

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int remaining=target-arr[i];
            if(map.containsKey(remaining)){
                System.out.println("yes");
            }
            map.put(arr[i],i);

        }
    }
}
