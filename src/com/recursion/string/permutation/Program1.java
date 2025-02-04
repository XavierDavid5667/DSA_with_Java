package com.recursion.string.permutation;

public class Program1 {

    public static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(f+c+s,up.substring(1));

        }
    }
    public static void main(String[] args) {
      String s="abc";
      permutation("",s);
    }
}
