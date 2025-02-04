package com.recursion.string;

public class Program4 {

    public static String removeCharacter(String s){
        if(s.isEmpty()){
            return "";
        }
        char c=s.charAt(0);
        if(c=='a'){
           return removeCharacter(s.substring(1));
        }else {
             return c+removeCharacter(s.substring(1));
        }
    }

    public static void main(String[] args) {
    String s="bcaaaccd";
        String s1 = removeCharacter(s);
        System.out.println(s1);
    }
}
