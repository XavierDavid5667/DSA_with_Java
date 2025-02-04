package com.recursion.string;

public class Program5 {

    public static void subSequence(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char c=unprocessed.charAt(0);
        subSequence(processed+c,unprocessed.substring(1));
        subSequence(processed,unprocessed.substring(1));
    }

    public static void main(String[] args) {
       subSequence("","abc");
    }
}
