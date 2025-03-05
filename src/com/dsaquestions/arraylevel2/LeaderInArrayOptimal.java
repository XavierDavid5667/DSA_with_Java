package com.dsaquestions.arraylevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeaderInArrayOptimal {
    public static List<Integer> getLeaders(int[] arr){
        int leader=Integer.MIN_VALUE;
        List<Integer>list=new ArrayList<>();
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]>leader){
                list.add(arr[i]);
                leader=arr[i];
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getLeaders(new int[]{10, 22, 12, 3, 0, 6}));

    }
}
