package com.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program3 {
    private int[] arr;
    public void createArray(int n){
        Scanner scanner=new Scanner(System.in);
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
            System.out.println("Entered "+(i+1)+" element");
        }
    }

    public void calculateFreqeuncy(){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
//        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//            System.out.println("Frequency of "+entry.getKey()+" is "+entry.getValue());
//        }

        int maxElement=Integer.MIN_VALUE,maxFrequency=Integer.MIN_VALUE;
        int minElement=Integer.MAX_VALUE,minFrequency=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           int value=entry.getKey();
           int frequency=entry.getValue();
           if(frequency>maxFrequency){
               maxFrequency=frequency;
               maxElement=value;
           }
           if(frequency<minFrequency){
               minFrequency=frequency;
               minElement=value;
           }
        }
        System.out.println("Highest Frequency of "+maxElement+" is "+maxFrequency);
        System.out.println("Lowest Frequency of "+minElement+" is "+minFrequency);
        System.out.println();
    }
    public static void main(String[] args) {
        Program3 program3=new Program3();
        program3.createArray(6);
        program3.calculateFreqeuncy();
    }
}
