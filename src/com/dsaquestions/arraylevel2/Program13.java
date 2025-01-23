package com.dsaquestions.arraylevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program13 {

    public List<Integer> rearrange(int[] arr) {
        int n=arr.length;
        int positivePointer=0;
        int negativePointer=1;
        List<Integer> list=new ArrayList<>(Collections.nCopies(n, 0));
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                list.set(positivePointer,arr[i]);
                positivePointer+=2;
            }else if(arr[i]<0){
              list.set(negativePointer,arr[i]);
              negativePointer+=2;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={1,2,-3,-1,-2,3};
        Program13 obj=new Program13();
        System.out.println(obj.rearrange(arr));
    }
}
