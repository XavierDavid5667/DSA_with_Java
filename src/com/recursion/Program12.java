package com.recursion;

import java.util.Scanner;

public class Program12 {

    public static String reverse(String s){
        if(s.length()==1) return s;

        return s.substring(s.length()-1)+ reverse(s.substring(0,s.length()-1));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        if(s.equals(reverse(s))){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
