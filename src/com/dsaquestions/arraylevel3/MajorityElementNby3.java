package com.dsaquestions.arraylevel3;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementNby3 {
    public static List<Integer> majorityElement(int[] arr){
       List<Integer> temp=new ArrayList<>();
       int minLenght= (int) Math.floor(arr.length/3);
        for(int i=0;i<arr.length;i++){
            int count=0;
            if(!temp.contains(arr[i])) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i]==arr[j]){
                     count++;
                    }
                }
                if(count>minLenght){
                    temp.add(arr[i]);
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,3,3,2,2,2};
        System.out.println(majorityElement(arr));
    }
}
