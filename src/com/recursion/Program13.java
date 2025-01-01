package com.recursion;

import java.util.Scanner;

public class Program13 {

    public static boolean isPalindrome(int i,String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return isPalindrome(i+1,s);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.next();
        boolean flag=isPalindrome(0,s);
        if(flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
