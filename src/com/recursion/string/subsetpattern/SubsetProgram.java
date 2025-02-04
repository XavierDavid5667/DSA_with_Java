package com.recursion.string.subsetpattern;

public class SubsetProgram {

    public static void subset(String p,String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }
        subset(p+un.charAt(0),un.substring(1));
        subset(p,un.substring(1));
    }

    public static void main(String[] args) {
        subset("","abc");
    }

}
