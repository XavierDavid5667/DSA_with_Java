package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Program1 {
    public static  void duplicate(){
        String name="XavierDavid";
        String[] stringArray= name.toLowerCase().split("");
        Map<String,Integer>map=new HashMap<>();
        for(String s:stringArray){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        map.entrySet().stream().filter(entry->entry.getValue()>1).forEach(s-> System.out.println(s.getKey()));
    }

    public static void main(String[] args) {
     duplicate();


    }
}
