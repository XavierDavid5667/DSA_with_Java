package com.dsaquestions.arraylevel2;

import java.util.HashMap;
import java.util.Map;

public class Program4 {

    public static int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i< nums.length;i++){
            int renaming=target-nums[i];
            if(map.containsKey(renaming)){
                return new int[]{map.get(renaming),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={2, 6, 5, 8, 11};
        int target=14;
        int[] ans=twoSum(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
