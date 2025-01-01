package com.recursion;

import java.util.Scanner;

public class Program5 {
    public static int sum(int i,int sum,int n){
       if(i>n){
           return sum;
       }
       sum=sum+i;
       i=i+1;
       return sum(i,sum,n);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(sum(1,0,n));
    }
}
