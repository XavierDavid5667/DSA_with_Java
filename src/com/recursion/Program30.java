package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class Program30 {

    public List<Integer> findAllElemenst(int[] arr, int target,int index){
        List<Integer>list=new ArrayList<>();
        if(index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        List<Integer> elements = findAllElemenst(arr, target, index + 1);
        list.addAll(elements);
        return list;

    }
    public static void main(String[] args) {
        int[] arr={2,3,1,4,4,5};
        int target=4;
        Program30 obj=new Program30();
        System.out.println(obj.findAllElemenst(arr,target,0));
    }
}
