package com.recursion.string.subsetpattern;

import java.util.ArrayList;
import java.util.List;

public class SubSetUsingArrayList {
    public static List<String> subset(String p,String un){
        List<String>list=new ArrayList<>();
        if(un.isEmpty()){
            list.add(p);
            return list;
        }
        List<String> subset1 = subset(p + un.charAt(0), un.substring(1));
        List<String> subset2=subset(p,un.substring(1));
        list.addAll(subset1);
        list.addAll(subset2);
        return list;
    }
    public static void main(String[] args) {
        List<String> abc = subset("", "abc");
        System.out.println(abc);
    }
}
