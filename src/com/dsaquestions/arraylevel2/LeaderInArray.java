package com.dsaquestions.arraylevel2;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array, print all the elements which are leaders.
 * A Leader is an element that is greater than all of the elements on its right side in the array.
 */
public class LeaderInArray {

    private static List<Integer> getLeaders(int[] arr){
        List<Integer>list=new ArrayList<>();
        list.add(arr[arr.length-1]);
        for(int i= arr.length-2;i>=0;i--){
            int max=arr[i];
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j] > max) {
                    flag=false;
                    break;
                }
            }
            if(flag) {
                list.add(max);
            }
        }
        return list;
    }

    public static void main(String[] args) {
     int[] arr={10, 22, 12, 3, 0, 6};
        List<Integer> leaders = getLeaders(arr);
        System.out.println(leaders);
    }
}
