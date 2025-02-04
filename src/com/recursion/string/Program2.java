package com.recursion.string;

public class Program2 {

    public static String removeCharacter(String s ,int index,String s1){
      if(index>=s.length()) {
        return s1;
      }
          if(s.charAt(index)!='a'){
              s1+=s.charAt(index);
             return removeCharacter(s,++index,s1);
          }
          return removeCharacter(s,++index,s1);
    }
    public static void main(String[] args) {
        System.out.println(removeCharacter("baccad",0,""));
    }
}
