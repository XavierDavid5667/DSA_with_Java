package com.numberproblems;

import java.util.Scanner;

public class Program3 {

    public static int reverse(int n){
        int reverse=0;
        while(n>0){
            int lastDigit=n%10;
            reverse=reverse*10+lastDigit;
            n=n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(reverse(n));
    }
}
