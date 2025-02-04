package com.recursion.string;

public class Program3 {

    public static String removeCharacter(String s1,String ans){
        if(s1.length()==0){
            return ans;
        }
        if(s1.charAt(0)!='a'){
             ans+=s1.charAt(0);
        }
        return removeCharacter(s1.substring(1),ans);
    }
    public static void main(String[] args) {
        System.out.println(removeCharacter("baccad",""));
    }
}
