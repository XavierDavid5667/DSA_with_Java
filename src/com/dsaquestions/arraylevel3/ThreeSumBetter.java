package com.dsaquestions.arraylevel3;

import java.util.*;

public class ThreeSumBetter {

    public static Set<List<Integer>> getTriplets(int[] arr){
        Set<List<Integer>>triplets=new HashSet<>();
        Set<Integer>set=new HashSet<>();
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int a_k=-(arr[i]+arr[j]);
                if(set.contains(a_k)){
                    List<Integer>list=new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(a_k);
                    Collections.sort(list);
                    triplets.add(list);
                    set.add(arr[j]);
                }else {
                    set.add(arr[j]);
                }
            }
            set.clear();
        }
        return triplets;
    }

    public static void main(String[] args) {
       int[] arr={-1,0,1,2,-1,-4};
        Set<List<Integer>> triplets = getTriplets(arr);
        for(List<Integer> list:triplets){
            System.out.println(list);
        }

    }
}
