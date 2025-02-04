package com.recursion.string;

public class RemoveCharacterFromStringUsingFunction {

    public  static final String APPLE="apple";
    public  static final int len=5;

    public static String removeCharacter(String s){
        if(s.isEmpty()){
            return "";
        }
        char c=s.charAt(0);
        if(c!='a'){
            return c+removeCharacter(s.substring(1));
        }else {
            return removeCharacter(s.substring(1));
        }
    }

    public static String removeString(String s){
        if(s.isEmpty()){
            return "";
        }

        if(!s.startsWith(RemoveCharacterFromStringUsingFunction.APPLE)){
            return s.charAt(0)+removeString(s.substring(1));
        }else {
            return removeString(s.substring(len));
        }
    }

    public static void main(String[] args) {
        String str="bacapplecd";
        String s = removeString(str);
        System.out.println(s);
    }
}
