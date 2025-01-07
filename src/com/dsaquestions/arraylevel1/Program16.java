package com.dsaquestions.array;

import java.util.HashMap;
import java.util.Map;

public class Program16 {

    public static int findSingleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={2,2,1};
        System.out.println(findSingleNumber(nums));
    }
}
