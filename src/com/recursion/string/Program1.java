package com.recursion.string;

public class Program1 {

    public static String removeCharacter(String s){
        String newString="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'){
                newString+=s.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(removeCharacter("baccad"));
    }

}

