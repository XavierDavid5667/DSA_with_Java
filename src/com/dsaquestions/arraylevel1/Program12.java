package com.dsaquestions.array;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Program12 {

    public static List<Integer> findUnion(int[] arr1,int[] arr2){

        int i=0;
        int j=0;
        Set<Integer> set=new HashSet<>();
      Arrays.stream(arr1).forEach(set::add);
      Arrays.stream(arr2).forEach(set::add);
      return set.stream().collect(Collectors.toList());




    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,4,5};
        System.out.println(findUnion(arr1,arr2));
    }
}
