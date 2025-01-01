package com.recursion;

import java.util.Scanner;

//sum of N Numbers using parameters
public class Program7 {
    public static void sumOfNums(int i,int sum) {
         if(i<1){
             System.out.println(sum);
             return;
         }
         sumOfNums(i-1,sum+i);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        sumOfNums(n,0);
    }
}
