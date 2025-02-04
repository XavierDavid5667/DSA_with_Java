package com.recursion.string;

public class ReverseString {
//Xavier
    public static String reverseString(String str) {
       if(str.length()==0){
           return str;
       }
       return reverseString(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Xavier"));
        System.out.println(reverseString("Xavier").length());
    }
}
