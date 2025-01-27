package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class Program29 {

    public List<Integer> findAllElements(int[] arr, int index, int target, List<Integer> list) {

        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return findAllElements(arr, index + 1, target, list);

    }
    public static void main(String[] args) {
        int[] arr={2,3,1,4,4,5};
        int target=4;
        List<Integer> list=new ArrayList<>();
        Program29 obj=new Program29();
        System.out.println(obj.findAllElements(arr,0,target,list)) ;
    }
}
