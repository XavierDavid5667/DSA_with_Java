package com.dsaquestions.arraylevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program15 {

    public static int[] rearrange(int[] arr) {
        List<Integer> positives=new ArrayList<>();
        List<Integer> negatives=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positives.add(arr[i]);
            }else if(arr[i]<0){
                negatives.add(arr[i]);
            }
        }
        System.out.println(positives+" "+negatives);
        int positivePointer=0,negativePointer=0,i=0;
        int postivePointerInArray=0,negativePointerInArray=1;
        while(positivePointer<positives.size() && negativePointer<negatives.size()){
            arr[postivePointerInArray]=positives.get(positivePointer);
            positivePointer++;
            postivePointerInArray+=2;
            arr[negativePointerInArray]=negatives.get(negativePointer);
            negativePointer++;
            negativePointerInArray+=2;
        }
        while(positivePointer<positives.size() && i<arr.length){
            arr[postivePointerInArray++]=positives.get(positivePointer++);
        }
        while(negativePointer<negatives.size() && i<arr.length){
            arr[negativePointer++]=negatives.get(negativePointer++);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,-4,-5,3,4};
        System.out.println(Arrays.toString(rearrange(arr)));
    }
}
