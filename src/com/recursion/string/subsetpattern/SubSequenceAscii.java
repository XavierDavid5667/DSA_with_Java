package com.recursion.string.subsetpattern;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceAscii {

    public  static  List<String> subSequenceAscii(String p, String up){
        if(up.isEmpty()){
            List<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char c=up.charAt(0);
        List<String>list1=subSequenceAscii(p+c,up.substring(1));
        List<String>list2=subSequenceAscii(p,up.substring(1));
        List<String> list3 = subSequenceAscii(p + (c + 0), up.substring(1));

        list1.addAll(list2);
        list1.addAll(list3);
        return list1;
    }
    public static void main(String[] args) {
        List<String> list = subSequenceAscii("", "abc");
        System.out.println(list);
    }
}
