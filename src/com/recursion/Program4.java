package com.recursion;

import java.util.Scanner;

public class Program4 {
     public static void printNto1(int n) {
         if(n<1){
             return;
         }
         System.out.println(n);
         n=n-1;
         printNto1(n);
     }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i= scanner.nextInt();
        printNto1(i);
    }
}
