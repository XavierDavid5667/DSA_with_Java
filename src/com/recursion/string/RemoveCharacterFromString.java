package com.recursion.string;

public class RemoveCharacterFromString {
    public static void   removeCharacter(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char c=unprocessed.charAt(0);
        if(c=='a'){
            removeCharacter(processed,unprocessed.substring(1));
        }else {
            removeCharacter(processed+c,unprocessed.substring(1));
        }
    }

    public static void main(String[] args) {
      String s="baccad";
        removeCharacter("", s);

    }


}
