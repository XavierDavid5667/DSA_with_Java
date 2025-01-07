package com.dsaquestions.arraylevel2;

import java.util.HashMap;

public class Program3 {

    public static String twoSum(int[] arr,int target) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            int otherNum=target-arr[i];
            if(map.containsKey(otherNum)){
                return "Yes";
            }
            map.put(arr[i],i);
        }
        return "No";

    }
    public static void main(String[] args) {
        int[] arr={2, 6, 5, 8, 11};
        int target=14;
        String ans=twoSum(arr,target);
        System.out.println(ans);
    }
}
