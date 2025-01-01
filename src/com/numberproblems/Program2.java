package com.numberproblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program2 {

    public static List<Integer> extractNums(int n){
         List<Integer>list=new ArrayList<>();
         while(n>0){
             list.add(n%10);
             n=n/10;
         }
       return   list.stream().sorted(Comparator.reverseOrder()).toList();
    }
    public static void main(String[] args) {
        System.out.println(extractNums(1234));

    }
}
