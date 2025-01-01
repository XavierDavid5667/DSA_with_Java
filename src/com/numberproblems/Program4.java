package com.numberproblems;

import java.util.Scanner;

public class Program4 {

    public static boolean palindrome(int n){
        int orginalNumber=n;
        int reverse=0;
        while(n>0){
            int lastDigit=n%10;
            reverse=reverse*10+lastDigit;
            n=n/10;
        }
        if(reverse==orginalNumber) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(palindrome(141));
    }
}
